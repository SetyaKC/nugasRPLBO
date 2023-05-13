package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class transfer_beranda_controller {

    public transfer_beranda_controller() {

    }
    Main m = new Main();

    private Button tf;

    public void tf(ActionEvent event) throws IOException {
        m.changeScene("transfer_beranda.fxml");
    }



}