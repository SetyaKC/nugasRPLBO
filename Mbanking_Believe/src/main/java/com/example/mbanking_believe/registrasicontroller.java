package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class registrasicontroller {

    public registrasicontroller() {

    }
    Main m = new Main();


    @FXML
    private Button buttonLogin;
    @FXML
    private Button buttonreg;
    @FXML
    private Button back;
    @FXML
    private Button bck;
    @FXML
    private Button simpan;
    @FXML
    private Button next;
    @FXML
    private Button df;
    @FXML
    private Button b;
    @FXML
    private Button lg;

    public void toLog(ActionEvent event) throws IOException {
        m.changeScene("login.fxml");
    }
    public void toReg(ActionEvent event) throws IOException {
        m.changeScene("registrasi1.fxml");
    }
    public void toback(ActionEvent event) throws IOException {
        m.changeScene("registrasi.fxml");
    }
    public void tosv(ActionEvent event) throws IOException {
        m.changeScene("registrasi2.fxml");
    }
    public void bck(ActionEvent event) throws IOException {
        m.changeScene("registrasi1.fxml");
    }
    public void todf(ActionEvent event) throws IOException {
        m.changeScene("berhasil.fxml");
    }
    public void b(ActionEvent event) throws IOException {
        m.changeScene("Registrasi2.fxml");
    }
    public void lg(ActionEvent event) throws IOException {
        m.changeScene("login.fxml");
    }
    public void nxt(ActionEvent event) throws IOException {
        m.changeScene("verifikasipin.fxml");
    }




}