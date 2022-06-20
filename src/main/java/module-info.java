module com.example.attemp18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.attemp18 to javafx.fxml;
    exports com.example.attemp18;
}