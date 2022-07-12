package com.example.attemp18;

import com.example.attemp18.model.DataProvider;
import com.example.attemp18.model.Dog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.ClosedWatchServiceException;
import java.util.EventObject;
import java.util.Optional;
import java.util.ResourceBundle;

public class CreateAnimalMenuController implements Initializable {
    Stage stage;
    Parent scene;
    @FXML
    void onActionBackMainMenu(ActionEvent event) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"This will clear all text field values, do you want to continue?");

        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK){


            stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/MainMenu.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();
        }
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
    private RadioButton vaccNoBtn;

    @FXML
    private RadioButton vaccYesBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }




    @FXML
    void onActionSaveAnimal(ActionEvent event) throws IOException {
        try{
            int id = Integer.parseInt(animalIdTxt.getText());
            String breed = breedTxt.getText();
            int lifespan = Integer.parseInt(lifespanTxt.getText());
            String behavior = behaviorTxt.getText();
            double price = Double.parseDouble(priceTxt.getText());
            boolean isVaccinated;
            String special = null;

            if(vaccYesBtn.isSelected())
                isVaccinated = true;
            else
                isVaccinated = false;

            DataProvider.addAnimal(new Dog(id, breed, lifespan, behavior, price, isVaccinated, special));

            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/MainMenu.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();
            }
        catch (NumberFormatException e){
            //This block shows the error definitions in the terminal for the devs
//            System.out.println("Please enter valid values in text fields");
//            System.out.println("Exception:" + e);
//            System.out.println("Exception:" + e.getMessage());

            //This block is specifically for the users when they do a bad
            Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setContentText("Please use valid value for each Test field!");
                alert.showAndWait();

        }



    }
}
