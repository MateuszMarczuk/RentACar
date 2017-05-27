package pl.BMI.controllers;


import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.BMI.dialogs.DialogUtils;

import java.io.IOException;
import java.util.Optional;
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

    public void closeApplication() {
        Optional<ButtonType> result = DialogUtils.confirmationDialog();
        if(result.get() == ButtonType.OK){
            Platform.exit();
            System.exit(0);
        }

    }

    public void editApplication(ActionEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
       // boolean value = ((CheckMenuItem) event.getSource()).selectedProperty().get();
        stage.setAlwaysOnTop(true);
    }

    public void openHelp() {
        DialogUtils.dialogAboutApplication();
    }
}
