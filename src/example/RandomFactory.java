package example;

import javafx.scene.image.ImageView;

import static example.Controller.imagePane;

public class RandomFactory implements Factory{

    @Override
    public void factoryMethod() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lizard lizard = new Lizard();
        ImageView imageView;

        int random = (int) (Math.random() * 3);
        if (random == 0) {
            imageView = new ImageView(dog.getAnimal());
        } else if (random == 1) {
            imageView = new ImageView(cat.getAnimal());
        } else {
            imageView = new ImageView(lizard.getAnimal());
        }

        int randomX = (int) (Math.random() * 525);
        int randomY = (int) (Math.random() * 350);

        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setX(randomX);
        imageView.setY(randomY);

        imagePane.getChildren().add(imageView);
    }
}
