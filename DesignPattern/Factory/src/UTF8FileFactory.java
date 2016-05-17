
public class UTF8FileFactory implements FileFactory {

	@Override
	public FileConvert createFileConvert() {
		return new UTF8FileConvert();
	}
	
	public void fun() {
		System.out.println("this in UTF9");
	}
}