import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public class ImgFileShow extends FileShow { 

    @Override 
    public void show() { 
        try { 
            InputStream ism = super.getInputStream();
            BufferedImage bufimg = ImageIO.read(ism); 
            int width = bufimg.getWidth(); 
            int height = bufimg.getHeight(); 
            System.out.println("height is:" + height); 
            System.out.println("width is:" + width); 
            /** 
            for (int i = 0; i < width; i++) { 
                for (int j = 0; j < height; j++) { 
                    System.out.print(bufimg.getRGB(i, j) + " "); 
            } 
            System.out.println(""); 
            } 
            **/ 
            ism.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
