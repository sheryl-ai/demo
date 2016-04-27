import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.io.*;

public class TemperatureLoggerObserver implements Observer{
	private String filename = "TemperatureLog.txt";
	private int numOfRecord;
	
	public TemperatureLoggerObserver() {
		File myFile = new File(filename);
		if (!myFile.exists()) {
			try {
				myFile.createNewFile();
			}
			catch (Exception e) {
				System.out.println("Log file created failed");
			}
		}
		String record = this.getLog("numOfRecord");
		
		if (record == "null") {
			this.setLog("numOfRecord", "0");
			this.numOfRecord = 0;
		}
		else {
			numOfRecord = Integer.parseInt(record);
		}
	}
	
	private void setLog(String key, String value) {		
		try {
			InputStream in = new FileInputStream(this.filename);
			Properties p = new Properties();
			p.load(in);
			in.close();
			OutputStream out = new FileOutputStream(filename);
			p.setProperty(key, value);
			p.setProperty("numOfRecord", String.valueOf(numOfRecord));
			p.store(out, "");
			out.close();
		}
		catch (FileNotFoundException e){
			System.out.println("can't open the log file!");
		}
		catch (IOException e){
			System.out.println("Input or output error!");
		}
	}
	
	private String getLog(String key) {
		try {
			InputStream in = new FileInputStream(this.filename);
			Properties p = new Properties();
			p.load(in);
			in.close();
			return String.valueOf(p.get(key));
		}
		catch (FileNotFoundException e){
			System.out.println("can't open the log file!");
		}
		catch (IOException e){
			System.out.println("Input or output error!");
		}
		return null;
	}
	
	public void logTemperature(double temperature){
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
		this.setLog(String.valueOf(this.numOfRecord++), time.format(new Date()));
		this.setLog(String.valueOf(this.numOfRecord++), String.valueOf(temperature));
	}
	
	public void showLog() {
		for (int i = 0; i < this.numOfRecord; i += 2) {
			System.out.print(this.getLog(String.valueOf(i)));
			System.out.println(" = " + this.getLog(String.valueOf(i + 1)));
		}
	}
	
	@Override
	public void update(double temperature) {
		this.logTemperature(temperature);
	}
}