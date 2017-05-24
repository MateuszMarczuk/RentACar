package pl.BMI.controllers;


import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

/**
 * Created by Mateusz on 23.05.2017.
 */
public class MainController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;


    @FXML
    private void initialize(){
        topMenuButtonsController.setMainController(this);
    }

}
