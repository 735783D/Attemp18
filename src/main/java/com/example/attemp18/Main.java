package com.example.attemp18;

import com.example.attemp18.model.DataProvider;
import com.example.attemp18.model.Dog;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("It Has Begun!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
            //Put these here, so they are loaded up before the tableview, and they don't need to reload every time
        Dog dog1 = new Dog(1, "ChowChow", 15, "Annoying", 199.92, true, "Dies");
        Dog dog2 = new Dog(2, "Thingy", 5, "Still Annoying", 599.92, true, "D fast");
        Dog dog3 = new Dog(3, "Mutt", 99, "Sweet", 1.92, false, "Immortal");
        Dog dog4 = new Dog(4, "Dalmatian", 1, "Stupid", 1999.92, false, "Eats fire");
        Dog dog5 = new Dog(5, "Malamute", 20, "Awesome", 2999.92, true, "Bringer");

        DataProvider.addAnimal(dog1);
        DataProvider.addAnimal(dog2);
        DataProvider.addAnimal(dog3);
        DataProvider.addAnimal(dog4);
        DataProvider.addAnimal(dog5);

        launch();
    }
}