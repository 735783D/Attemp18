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

public class MainMenuController implements Initializable {

    Stage stage;
    Parent scene;
    @FXML
    void onActionCreateAnimal(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/CreateAnimalMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

        System.out.println("Create Button Clicked");
    }

    @FXML
    void onActionDisplayAnimals(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/DisplayAnimalsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        System.out.println("Display Button Clicked");
    }

    @FXML
    void onActionExit(ActionEvent event) {

        System.out.println("Exit Button Clicked");
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}