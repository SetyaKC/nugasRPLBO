package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {

    public HelloController() {

    }
    Main m = new Main();


    @FXML
    private Button buttonNext;

    public void toLogin(ActionEvent event) throws IOException {
        m.changeScene("registrasi.fxml");
    }

}