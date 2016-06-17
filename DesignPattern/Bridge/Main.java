import java.io.*;
import java.net.*;

public class Main{
    public static void main(String[] args) {
        //local text show
        FileShow textShow = new TextFileShow();
        textShow.setFileRead(new LocalRead());
        textShow.setFilePath("data.txt");
        textShow.show();


        //remote text show
        textShow.setFileRead(new UrlRead());
        textShow.setFilePath("http://www.bing.com");
        textShow.show();


        //remote img show
        String urlPath = "http://picm.photophoto.cn/015/037/003/0370031016.jpg";
        FileShow imgShow = new ImgFileShow();
        imgShow.setFileRead(new UrlRead());
        imgShow.setFilePath(urlPath);
        imgShow.show();

        //local img show
        imgShow.setFileRead(new LocalRead());
        imgShow.setFilePath("avatar.jpg");
        imgShow.show();
    }
}
