package example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Pane animalPane;

    @FXML
    private Button random;

    @FXML
    private Button balanced;

    @FXML
    private Button clear;

    protected static Pane imagePane;

    private Factory randomFactory;
    private Factory balancedFactory;


    @FXML
    public void initialize() {
        imagePane = new Pane();
        imagePane.setMaxWidth(animalPane.getMaxWidth() - 75);
        imagePane.setMaxHeight(animalPane.getMaxHeight());
        animalPane.getChildren().add(imagePane);
        randomFactory = new RandomFactory();
        balancedFactory = new BalancedFactory();
    }

    @FXML
    public void randomButton() {
        randomFactory.factoryMethod();
    }

    @FXML
    public void balancedButton() {
        balancedFactory.factoryMethod();
    }

    @FXML
    public void clearButton() {
        imagePane.getChildren().clear();
    }







}