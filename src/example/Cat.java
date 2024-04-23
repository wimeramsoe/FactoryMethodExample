package example;

import javafx.scene.image.Image;

public class Cat implements Animal {
    private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("cat.jpg");
    }

    public int getCatCount() {
        return count;
    }
}
