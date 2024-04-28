package example;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import static example.Controller.*;

public class RandomFactory implements Factory{

        private final Dog dog = new Dog();
        private final Cat cat = new Cat();
        private final Lizzard lizzard = new Lizzard();

        @Override
        public void factoryMethod() {
                ImageView imageView;

                int random = (int) (Math.random() * 3);
                if (random == 0) {
                        imageView = new ImageView(dog.getAnimal());
                } else if (random == 1) {
                        imageView = new ImageView(cat.getAnimal());
                } else {
                        imageView = new ImageView(lizzard.getAnimal());
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
