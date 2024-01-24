module com.example.tp7memory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp7memory to javafx.fxml;
    exports com.example.tp7memory;
}