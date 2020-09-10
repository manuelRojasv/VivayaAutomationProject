package VivayaTests;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadImage
{
    public static void main(String[] args )
    {
        BufferedImage image =null;
        try{
            URL url =new URL("https://img.europapress.es/fotoweb/fotonoticia_20180921083333_420.jpg");
            image = ImageIO.read(url);
            ImageIO.write(image, "jpg",new File("D:/imagen.jpg"));
            System.out.println("ENTRO");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
