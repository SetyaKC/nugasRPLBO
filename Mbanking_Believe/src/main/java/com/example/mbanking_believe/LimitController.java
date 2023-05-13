package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LimitController {

    public LimitController() {

    }

    Main m = new Main();

    @FXML
    public Button buttonBack;

    public void toBack(ActionEvent event) throws IOException {
        m.changeScene("akun-saya.fxml");
    }

}
