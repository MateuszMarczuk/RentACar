package pl.BMI.controllers;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.BMI.utils.DialogUtils;
import pl.BMI.utils.FxmlUtils;

import java.util.Optional;

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
        borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));

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
