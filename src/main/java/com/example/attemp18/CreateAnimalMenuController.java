package com.example.attemp18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

public class CreateAnimalMenuController implements Initializable {
    Stage stage;
    Parent scene;
    @FXML
    void onActionBackMainMenu(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    private TextField animalIdTxt;

    @FXML
    private TextField behaviorTxt;

    @FXML
    private TextField breedTxt;

    @FXML
    private TextField lifespanTxt;

    @FXML
    private TextField priceTxt;

    @FXML
    private RadioButton vacNoBtn;

    @FXML
    private RadioButton vaccYesBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    void onActionDisplayAnimals (ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/DisplayAnimalsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        System.out.println("Display Button Clicked");
    }
}
