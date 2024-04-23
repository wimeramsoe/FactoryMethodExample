package example;

import javafx.scene.image.Image;

public class Lizzard implements Animal{
    private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("lizzard.jpg");
    }

    public int getLizzardCount() {
        return count;
    }
}
