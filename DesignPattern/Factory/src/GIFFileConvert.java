import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GIFFileConvert implements FileConvert{
	
	@Override
	public void show(File fileName) {
		try {
			BufferedImage bufimage = ImageIO.read(
					new FileInputStream(fileName));
			int width = bufimage.getWidth();
			int height = bufimage.getHeight();
			System.out.println("这个图像的高是： " + height);
			System.out.println("这个图像的宽是： " + width);
			System.out.println("每一点的RGB三基色信息是：");
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					System.out.print(bufimage.getRGB(i, j) + " ");
				}
				System.out.println("");
			}
			ImageIO.write(bufimage, "GIF", fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}