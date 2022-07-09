package com.example.attemp18;

import com.example.attemp18.model.Animal;
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
import java.util.EventObject;
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

    public void sendAnimal(Animal dog){
        animalIdLbl.setText(String.valueOf(dog.getId()));
        breedLbl.setText(dog.getBreed());
        lifespanLbl.setText(String.valueOf(dog.getLifespan()));
        priceLbl.setText(String.valueOf(dog.getPrice()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onActionDisplayAnimals(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }
}
