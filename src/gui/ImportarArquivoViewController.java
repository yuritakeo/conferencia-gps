/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author yuri.miyazaki
 */
public class ImportarArquivoViewController implements Initializable {

    @FXML
    private TextField txtCaminhoArquivo;

    @FXML
    private Button btEncontrarArquivo;

    @FXML
    private Label lbNome;

    @FXML
    private Label lbDataModificacao;

    @FXML
    private Label lbTamanhoArquivo;

    @FXML
    private Button btImportar;

    @FXML
    public void onBtEncontrarArquivo_Action() {
        System.out.println("onBtEncontrarArquivo_Action");
    }

    @FXML
    public void onBtImportar_Action() {
        System.out.println("onBtImportar_Action");
    }
    
    //Comentário
    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }

}
