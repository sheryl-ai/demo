
public class FileManager {
	private FileFactory fileFactory;
	public FileFactory setFactoryCodeType(String fileType){
		switch(fileType) {
		case "GBK":
			fileFactory = new GBKFileFactory();
			break ;
		case "UTF8":
			fileFactory = new UTF8FileFactory();
			break ;
		case "GIF":
			fileFactory = new GIFFileFactory();
			break ;
		case "JPG":
			fileFactory = new JPGFileFactory();
			break ;
		}
		return fileFactory;
	}
}
