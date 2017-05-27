package pl.BMI.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Mateusz on 27.05.2017.
 */
public class DialogUtils {

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.messages");

    public static void dialogAboutApplication(){
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle(resourceBundle.getString("about.title"));
        informationAlert.setHeaderText(resourceBundle.getString("about.header"));
        informationAlert.setContentText(resourceBundle.getString("about.content"));
        informationAlert.showAndWait();
    }

    public static Optional<ButtonType> confirmationDialog(){
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle(resourceBundle.getString("exit.title"));
        confirmationAlert.setHeaderText(resourceBundle.getString("exit.header"));
        Optional<ButtonType> result = confirmationAlert.showAndWait();
        return result;
    }
}
