package example;

import javafx.scene.image.ImageView;

import static example.Controller.*;

public class BalancedFactory implements Factory {
    private final Dog dog = new Dog();
    private final Cat cat = new Cat();
    private final Lizard lizard = new Lizard();

    @Override
    public void factoryMethod() {
        ImageView imageView;
        if (dog.getDogCount() <= cat.getCatCount() && dog.getDogCount() <= lizard.getLizzardCount()) {
            imageView = new ImageView(dog.getAnimal());
        } else if (cat.getCatCount() <= dog.getDogCount() && cat.getCatCount() <= lizard.getLizzardCount()) {
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
