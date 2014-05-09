package flyweight;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MyImage {

    private String path;

    public MyImage(String newPath) {
        this.path = newPath;
    }

    public Image getImage() {
        return new ImageIcon(path).getImage();
    }

    public void drawImage() {
        /**
         * empty method, just show the pattern implementation
         */
        System.out.println("Image drawed");
    }

}
