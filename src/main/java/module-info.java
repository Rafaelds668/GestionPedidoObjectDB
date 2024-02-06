module com.example.gestorpedidopbjectdb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestorpedidopbjectdb to javafx.fxml;
    exports com.example.gestorpedidopbjectdb;
}