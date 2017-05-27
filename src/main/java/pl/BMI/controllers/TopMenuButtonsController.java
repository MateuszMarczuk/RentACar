package pl.BMI.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;


/**
 * Created by Mateusz on 24.05.2017.
 */
public class TopMenuButtonsController {

    public static final String OPEN_CAR_FXML = "/fxml/OpenCar.fxml";
    public static final String OPEN_RENT_CAR_FXML = "/fxml/OpenRentCar.fxml";
    public static final String OPEN_STATISTIC_FXML = "/fxml/OpenStatistic.fxml";
    public static final String ADD_CAR_FXML = "/fxml/AddCar.fxml";
    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    public void openCar() {
        mainController.setCenter(OPEN_CAR_FXML);
        System.out.println("Open Car");
    }

    @FXML

    public void openRentCar() {
        mainController.setCenter(OPEN_RENT_CAR_FXML);
        System.out.println("Open Rent Car");
    }


    @FXML
    public void openStatistic() {
        mainController.setCenter(OPEN_STATISTIC_FXML);
        System.out.println("Open Statistic");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


    @FXML
    public void addCar() {
        if(toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }

        mainController.setCenter(ADD_CAR_FXML);
    }
}
