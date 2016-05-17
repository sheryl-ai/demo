import java.io.File;


public class Main {
	public static void main(String[] args) {
		FileManager fm = new FileManager();
		FileFactory ff1 = fm.setFactoryCodeType("UTF8");
		FileConvert fc1 = ff1.createFileConvert();
		fc1.show(new File("test_for_text.txt"));
		
		System.out.println("\n-----------------------");
		
		FileFactory ff2 = fm.setFactoryCodeType("GBK");
		FileConvert fc2 = ff2.createFileConvert();
		fc2.show(new File("test_for_text.txt"));
		
		
		System.out.println("\n-----------------------");
		
		FileFactory ff3 = fm.setFactoryCodeType("JPG");
		FileConvert fc3 = ff3.createFileConvert();
		fc3.show(new File("test_for_graph.jpg"));
		
		
		System.out.println("\n-----------------------");
		
		FileFactory ff4 = fm.setFactoryCodeType("GIF");
		FileConvert fc4 = ff4.createFileConvert();
		fc3.show(new File("test_for_graph.jpg"));
		
	}
}
