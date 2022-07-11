package com.example.attemp18;

import com.example.attemp18.model.Animal;
import com.example.attemp18.model.Dog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

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
        behaviorLbl.setText(dog.getBehavior());
        breedLbl.setText(dog.getBreed());
        lifespanLbl.setText(String.valueOf(dog.getLifespan()));
        priceLbl.setText(String.valueOf(dog.getPrice()));

        //Checks the boolean and prints what you want it to be equal to
        if(dog.isVaccinated())
            vaccLbl.setText("Yes");
        else
            vaccLbl.setText("No");

        //Castes a superclass method to a subclass just for a bit
        if(dog instanceof Dog)
            specialLbl.setText(((Dog) dog).getSpecial());


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onActionDisplayAnimals(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/DisplayAnimalsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }
}
