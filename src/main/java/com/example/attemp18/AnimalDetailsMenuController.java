package com.example.attemp18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AnimalDetailsMenuController implements Initializable {
    Stage stage;
    Parent scene;


    @FXML
    private Label animalIdLbl;

    @FXML
    private Label behaviorLbl;

    @FXML
    private Label breedLbl;

    @FXML
    private Label lifespanLbl;

    @FXML
    private Label priceLbl;

    @FXML
    private Label specialLbl;

    @FXML
    private Label vaccLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
