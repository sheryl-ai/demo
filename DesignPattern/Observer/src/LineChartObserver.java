import java.text.DecimalFormat;
import java.util.ArrayList;

public class LineChartObserver implements Observer{
	private double temperature = 0.0;
	private ArrayList<Object> temperatureList = new ArrayList<Object>();
	 
	@Override
	public void update(double temperature) {
		//this.showChange(temperature);
		temperatureList.add(temperature);
	}
	
	public LineChartObserver() {
		temperatureList.add(this.temperature);
	}
	
	public void showLineChart(double temperature) {
		DecimalFormat df = new DecimalFormat("#.00");
		for (int i = 1; i < temperatureList.size(); ++i) {
			System.out.print(df.format((double)temperatureList.indexOf(i) - (double)temperatureList.indexOf(i - 1)) + " ");
		}
	}
}
