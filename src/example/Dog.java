package example;

import javafx.scene.image.Image;

public class Dog implements Animal {
    static private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("file:dog.jpg");
    }

    public int getDogCount() {
        return count;
    }
}
