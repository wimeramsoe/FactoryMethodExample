package example;

import javafx.scene.image.Image;

public class Dog implements Animal {
    private int count = 0;

    @Override
    public Image getAnimal() {
        count++;
        return new Image("dog.jpg");
    }

    public int getDogCount() {
        return count;
    }
}
