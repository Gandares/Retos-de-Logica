import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

class Main{
    public static void main(String[] args) {
        try{
            GetImageRatioFromUrl.getRatio("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
        }
        catch(Exception err){
            System.out.println("Error: " + err);
        }
    }
}

class GetImageRatioFromUrl {
    public static void getRatio(String imageUrl) throws IOException {
        URL url = new URL(imageUrl);
        BufferedImage image = ImageIO.read(url);
        System.out.println("El ratio es -> " + (float)image.getWidth()/image.getHeight() + ":1");
    }
}