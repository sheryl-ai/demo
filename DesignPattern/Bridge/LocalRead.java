import java.io.*;

public class LocalRead implements FileRead {

    @Override
    public InputStream getInputStream(String filePath) {
        InputStream ism = null;
        try {
            ism = new FileInputStream(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ism;
    }
}
