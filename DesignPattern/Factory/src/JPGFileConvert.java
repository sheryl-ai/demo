import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JPGFileConvert implements FileConvert{
	
	@Override
	public void show(File fileName) {
		try {
			BufferedImage bufimage = ImageIO.read(
					new FileInputStream(fileName));
			int width = bufimage.getWidth();
			int height = bufimage.getHeight();
			System.out.println("���ͼ��ĸ��ǣ� " + height);
			System.out.println("���ͼ��Ŀ��ǣ� " + width);
			System.out.println("ÿһ���RGB����ɫ��Ϣ�ǣ�");
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					System.out.print(bufimage.getRGB(i, j) + " ");
				}
				System.out.println("");
			}
			ImageIO.write(bufimage, "JPG", fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}