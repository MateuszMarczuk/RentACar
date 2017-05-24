package pl.BMI.controllers;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ResourceBundle;

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

    public void setCenter(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
        ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(resourceBundle);
        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(parent);

    }

}
