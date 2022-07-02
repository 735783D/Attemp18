package com.example.attemp18;

import com.example.attemp18.model.Animal;
import com.example.attemp18.model.DataProvider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DisplayAnimalsMenuController implements Initializable {
    Stage stage;
    Parent scene;

    @FXML
    void onActionBackToMainMenu(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionToDetailsMenu(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/com/example/attemp18/AnimalDetailsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }


    @FXML
    private TableColumn<Animal, Integer> animalIdCol;

    @FXML
    private TableView<Animal> animalTableView;

    @FXML
    private TableColumn<Animal, String> breedCol;

    @FXML
    private TableColumn<Animal, Integer> lifespanCol;

    @FXML
    private TableColumn<Animal, Double> priceCol;


    public boolean search(int id){
        for(Animal dog : DataProvider.getAllAnimals()){
            if(dog.getId() == id)
                return true;
        }
        return false;
    }

    @Override           //This is like the 'main' function for a controller and is necessary
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Tells the controller what the table where the tableview gets its info
        animalTableView.setItems(DataProvider.getAllAnimals());

        //Populates the first cell in the id column of the tableview
        animalIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        //Populates the first cell in the breed column of the tableview
        breedCol.setCellValueFactory(new PropertyValueFactory<>("breed"));

        //Populates the first cell in the lifespan column of the tableview
        lifespanCol.setCellValueFactory(new PropertyValueFactory<>("lifespan"));

        //Populates the first cell in the price column of the tableview
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        if(search(44))
            System.out.println("Found!");
        else
            System.out.println("Not Found!");



    }
}
