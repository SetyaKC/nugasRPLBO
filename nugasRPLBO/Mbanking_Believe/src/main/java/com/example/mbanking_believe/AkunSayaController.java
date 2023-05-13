package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AkunSayaController {

    public AkunSayaController() {

    }

    MainApplication m = new MainApplication();

    @FXML
    public Button buttonMutasi;

    public void toMutasi(ActionEvent event) throws IOException {
        m.changeScene("Mutasi.fxml");
    }

    private Button buttonSaldo;

    public void toSaldo(ActionEvent event) throws IOException {
        m.changeScene("lihat-saldo.fxml");
    }

    private Button buttonLimit;

    public void toLimit(ActionEvent event) throws IOException {
        m.changeScene("limit-penarikan.fxml");
    }

    private Button buttonLayanan;

    public void toLayanan(ActionEvent event) throws IOException {
        m.changeScene("layanan-lain.fxml");
    }

}
