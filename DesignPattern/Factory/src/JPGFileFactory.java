
public class JPGFileFactory implements FileFactory {

	@Override
	public FileConvert createFileConvert() {
		return new JPGFileConvert();
	}
}