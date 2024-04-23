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


    @FXML
    public void initialize() {
        randomF = new RandomFactory();
        balancedF = new BalancedFactory();
    }


}