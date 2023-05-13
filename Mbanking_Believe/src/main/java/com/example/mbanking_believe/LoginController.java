package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    public LoginController() {
    }

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button buttonlog;
    @FXML
    private Label salah;
    Main m = new Main();

    public void toBeranda(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if (usernameField.getText().toString().equals("pamungkas") && passwordField.getText().toString().equals("123")) {
            salah.setText("Berhasil Login");
            m.changeScene("beranda.fxml");
        } else if (usernameField.getText().isEmpty() && passwordField.getText().isEmpty()) {
            salah.setText("Silahkan Masukkan Data Anda");
        } else {
            salah.setText("Username atau Password Salah");
        }
    }


}