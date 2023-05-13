package com.example.mbanking_believe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class BerandaController {

    public BerandaController() {

    }
    Main m = new Main();


    @FXML
    private Button logout;
    @FXML
    private Button ya;
    @FXML
    private Button tdk;
    @FXML
    private Button pay;
    private Button balek;
    private Button paylist;
    private Button bk;
    private Button lj;
    private Button bal;
    private Button nx;
    private Button lix;
    private Button ss;
    private Button ber;
    private Button to;
    private Button tv;
    private Button bel;
    private Button lan;
    private Button t1;
    private Button jut;
    private Button lek;
    private Button tvbuk;
    private Button ke;
    @FXML
    private Button totf;
    private Button back_pay;
    @FXML
    private Button sesama;
    @FXML
    private Button tos;
    @FXML
    private Button tf2;
    @FXML
    private Button tf1;
    @FXML
    private Button tf3;
    @FXML
    private Button bktf2;
    @FXML
    private Button tf4;
    @FXML
    private Button bkber;
    @FXML
    private Button trber;
    @FXML
    private Button tab2;
    @FXML
    private Button tabpin;
    @FXML
    private Button keval;
    @FXML
    private Button tabuk;
    @FXML
    private Button kkb;
    @FXML
    private Button fav;
    @FXML
    private Button tfnw;
    @FXML
    private Button fav2;
    private Button fav1;
    private Button akun;
    public void back_pay(ActionEvent event) throws IOException {
        m.changeScene("beranda.fxml");
    }

    public void totf(ActionEvent event) throws IOException {
        m.changeScene("transfer_ber.fxml");
    }

    public void toreg(ActionEvent event) throws IOException {
        m.changeScene("pertanyaan.fxml");
    }
    public void ya(ActionEvent event) throws IOException {
        m.changeScene("registrasi.fxml");
    }

    public void tdk(ActionEvent event) throws IOException {
        m.changeScene("beranda.fxml");
    }

   public void paylist(ActionEvent event) throws IOException{
        m.changeScene("tokenlistrik_1.fxml");
   }
  public void balek(ActionEvent event)throws IOException{
      m.changeScene("beranda.fxml");
  }


    public void bk(ActionEvent event)throws IOException {
        m.changeScene("payment_beranda.fxml");
    }

    public void lj(ActionEvent event) throws IOException{
        m.changeScene("tokenlistrik_validasi.fxml");
    }
    public void bal(ActionEvent event) throws IOException{
        m.changeScene("tokenlistrik_1.fxml");
    }
    public void nx(ActionEvent event) throws IOException{
        m.changeScene("tokenlistri_pin.fxml");
    }
    public void lik(ActionEvent event) throws IOException{
        m.changeScene("tokenlistrik_validasi.fxml");
    }
    public void ss(ActionEvent event) throws IOException{
        m.changeScene("token_bukti.fxml");
    }
    public void ber(ActionEvent event) throws IOException{
        m.changeScene("beranda.fxml");
    }
    public void topay(ActionEvent event) throws IOException{
        m.changeScene("payment_beranda.fxml");
    }
    public void tv(ActionEvent event) throws IOException{
        m.changeScene("tv_1.fxml");
    }
    public void bel(ActionEvent event) throws IOException{
        m.changeScene("payment_beranda.fxml");
    }
    public void lan(ActionEvent event) throws IOException{
        m.changeScene("tv_validasi.fxml");
    }
    public void t1(ActionEvent event) throws IOException{
        m.changeScene("tv_1.fxml");
    }
    public void jut(ActionEvent event) throws IOException{
        m.changeScene("tv_pin.fxml");
    }
    public void lek(ActionEvent event) throws IOException{
        m.changeScene("tv_validasi.fxml");
    }
    public void tvbuk(ActionEvent event) throws IOException{
        m.changeScene("tv_bukti.fxml");
    }
    public void ke(ActionEvent event) throws IOException{
        m.changeScene("beranda.fxml");
    }
    public void sesama(ActionEvent event) throws IOException{
        m.changeScene("transfersesama1.fxml");
    }
    public void tos(ActionEvent event) throws IOException{
        m.changeScene("transfer_ber.fxml");
    }
    public void tf2(ActionEvent event) throws IOException{
        m.changeScene("transfersesama2.fxml");
    }
    public void tf1(ActionEvent event) throws IOException{
        m.changeScene("transfersesama1.fxml");
    }
    public void tf3(ActionEvent event) throws IOException{
        m.changeScene("transfersesama3.fxml");
    }
    public void bktf2(ActionEvent event) throws IOException{
        m.changeScene("transfersesama2.fxml");
    }
    public void bkber(ActionEvent event) throws IOException{
        m.changeScene("beranda.fxml");
    }
    public void tf4(ActionEvent event) throws IOException{
        m.changeScene("transfersesama4.fxml");
    }
    public void antarbank(ActionEvent event) throws IOException{
        m.changeScene("transferantarbank1.fxml");
    }
    public void trber(ActionEvent event) throws IOException{
        m.changeScene("transfer_ber.fxml");
    }

    public void tab1(ActionEvent event) throws IOException{
        m.changeScene("transferantarbank1.fxml");
    }
    public void tab2(ActionEvent event) throws IOException{
        m.changeScene("transferanatarbank_validasi.fxml");
    }
    public void keval(ActionEvent event) throws IOException{
        m.changeScene("transferanatarbank_validasi.fxml");
    }
    public void tabuk(ActionEvent event) throws IOException{
        m.changeScene("transferantarbank_bukti.fxml");
    }
    public void tabpin(ActionEvent event) throws IOException{
        m.changeScene("transferantarbank_pin.fxml");
    }
    public void kkb(ActionEvent event) throws IOException{
        m.changeScene("beranda.fxml");
    }
    public void fav(ActionEvent event) throws IOException{
        m.changeScene("daftarfav_1.fxml");
    }
    public void tfnw(ActionEvent event) throws IOException{
        m.changeScene("transferantarbank1.fxml");
    }
    public void fav2(ActionEvent event) throws IOException{
        m.changeScene("daftarfav2.fxml");
    }
    public void fav1(ActionEvent event) throws IOException{
        m.changeScene("daftarfav_1.fxml");
    }
    public void validasi(ActionEvent event) throws IOException{
        m.changeScene("transferanatarbank_validasi.fxml");
    }
    public void akunsaya(ActionEvent event) throws IOException{
        m.changeScene("akun-saya.fxml");
    }


}