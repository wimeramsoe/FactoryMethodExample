package example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Controller {
    private Factory randomF;
    private Factory balancedF;

    @FXML
    private Pane animalPane;

    @FXML
    private Button random;

    @FXML
    private Button balanced;

    @FXML
    private Button clear;

    protected static Pane imagePane;


    @FXML
    public void initialize() {
        imagePane = new Pane();
        imagePane.setMaxWidth(animalPane.getMaxWidth() - 75);
        imagePane.setMaxHeight(animalPane.getMaxHeight());
        animalPane.getChildren().add(imagePane);
        randomF = new RandomFactory();
        balancedF = new BalancedFactory();
    }

    @FXML
    public void randomButton() {
        randomF.factoryMethod();
    }

    @FXML
    public void balancedButton() {
        balancedF.factoryMethod();
    }

    @FXML
    public void clearButton() {
        imagePane.getChildren().clear();
    }







}