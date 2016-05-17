
public class GBKFileFactory implements FileFactory {

	@Override
	public FileConvert createFileConvert() {
		return new GBKFileConvert();
	}
}
