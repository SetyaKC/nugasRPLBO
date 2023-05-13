module com.example.mbanking_believe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mbanking_believe to javafx.fxml;
    exports com.example.mbanking_believe;
}