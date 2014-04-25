package flyweight;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String pathDirectoryScan = "/home/elio/";
        File directory = new File(pathDirectoryScan);

        System.out.println("Start scanning");
        if (directory.isDirectory()) {

            File[] files = directory.listFiles();

            System.out.println("Number of files: " + files.length);
            for (int i = 0; i < files.length; i++) {
                String path = files[i].getPath();
                MyImage myImage = MyImageFactory.makeMyImage(path);
                if (myImage != null) {
                    myImage.drawImage();
                }
            }
        } else {
            System.out.println("Is not a directory");
        }
    }
}
