module com.example.proyecto2datos1adri {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto2datos1adri to javafx.fxml;
    exports com.example.proyecto2datos1adri;
}