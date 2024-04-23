package example;

import javafx.scene.image.Image;

public class Lizzard implements Animal{
    static private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("file:lizzard.jpg");
    }

    public int getLizzardCount() {
        return count;
    }
}
