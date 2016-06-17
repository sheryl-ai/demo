import java.io.*;

abstract class FileShow {
    private FileRead fileRead;
    private String filePath;


    public void setFileRead(FileRead fileRead) {
        this.fileRead = fileRead;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public InputStream getInputStream() {
        return fileRead.getInputStream(this.filePath);
    }

    public abstract void show();
}
