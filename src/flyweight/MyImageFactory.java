package flyweight;

import java.util.HashMap;

public class MyImageFactory {

    /**
     * Database list of files
     */
    private static HashMap<String, MyImage> images = new HashMap<>();

    public static MyImage makeMyImage(String path) {
        MyImage image = null;

        if (!path.isEmpty()) {
            image = images.get(path);
        }

        return image;
    }

}
