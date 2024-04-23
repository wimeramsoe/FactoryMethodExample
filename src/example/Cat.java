package example;

import javafx.scene.image.Image;

public class Cat implements Animal {
    static private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("file:cat.jpg");
    }

    public int getCatCount() {
        return count;
    }
}
