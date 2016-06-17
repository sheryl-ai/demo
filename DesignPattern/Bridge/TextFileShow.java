import java.io.*;

public class TextFileShow extends FileShow { 

    @Override 
    public void show() { 
        try { 
            InputStream ism = super.getInputStream();
            int ch;
            while ((ch = ism.read()) != -1) {
                System.out.print((char)ch);
            }
            ism.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
