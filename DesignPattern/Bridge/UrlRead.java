import java.io.*;
import java.net.*;

public class UrlRead implements FileRead {

    @Override
    public InputStream getInputStream(String filePath) {
        InputStream ism = null;
        try {
            URL url = new URL(filePath);
            ism = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ism;
    }
}
