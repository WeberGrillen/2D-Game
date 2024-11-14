package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door extends SuperObject{

    // Constructor
    public OBJ_Door() {

        name = "door";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/door.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
