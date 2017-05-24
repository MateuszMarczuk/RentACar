package pl.BMI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Mateusz on 23.05.2017.
 */
public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/BorderPaneMain.fxml"));
        ResourceBundle resourceBundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(resourceBundle);
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(resourceBundle.getString("title.application"));
        primaryStage.show();
    }
}
