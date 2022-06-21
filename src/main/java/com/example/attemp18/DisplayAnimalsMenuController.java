package com.example.attemp18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

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
    private TableColumn<?, ?> animalIdCol;

    @FXML
    private TableView<?> animalTableView;

    @FXML
    private TableColumn<?, ?> breedCol;

    @FXML
    private TableColumn<?, ?> lifespanCol;

    @FXML
    private TableColumn<?, ?> priceCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
