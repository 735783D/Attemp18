module com.example.attemp18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.attemp18 to javafx.fxml;
    exports com.example.attemp18;
    exports com.example.attemp18.model;
    opens com.example.attemp18.model to javafx.fxml;
}