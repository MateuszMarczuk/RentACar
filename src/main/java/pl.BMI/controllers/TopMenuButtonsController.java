package pl.BMI.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


/**
 * Created by Mateusz on 24.05.2017.
 */
public class TopMenuButtonsController {

    private MainController mainController;

    @FXML
    public void openCar() {
        System.out.println("Open Car");
    }

    @FXML
    public void openRentCar() {
        System.out.println("Open Rent Car");
    }


    @FXML
    public void openStatistic() {
        System.out.println("Open Statistic");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
