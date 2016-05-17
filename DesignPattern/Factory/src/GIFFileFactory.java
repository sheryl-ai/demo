
public class GIFFileFactory implements FileFactory {

	@Override
	public FileConvert createFileConvert() {
		return new GIFFileConvert();
	}
}