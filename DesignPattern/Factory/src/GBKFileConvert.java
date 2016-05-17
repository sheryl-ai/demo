import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class GBKFileConvert implements FileConvert{
	
	@Override
	public void show(File fileName) {
		try {
			int bufferSize = 512;
			BufferedInputStream bin = new BufferedInputStream(
					new FileInputStream(fileName));
			byte buffer[] = new byte[bufferSize];
			while((bin.read(buffer, 0, bufferSize)) != -1){  
				System.out.print(new String(buffer, "GBK"));
	        }  
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}