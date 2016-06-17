import java.io.*;

interface FileRead {
    public abstract InputStream getInputStream(String filePath);
}
