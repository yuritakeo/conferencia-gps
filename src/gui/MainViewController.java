/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conferencia.gps.Main;
import gui.util.Alerts;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author yuri.miyazaki
 */
public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemArquivosImportar;

    @FXML
    private MenuItem menuItemRelatorioDivergencia;

    @FXML
    private MenuItem menuItemAjudaSobre;

    @FXML
    public void onMenuItemArquivoImportar_Action() {
        loadView("/gui/ImportarArquivoView.fxml");
    }

    @FXML
    public void onMenuItemRelatorioDivergencia_Action() {
        System.out.println("onMenuItemRelatorioDivergencia_Action");
    }

    @FXML
    public void onMenuItemAjudaSobre_Action() {
        loadView("/gui/Sobre.fxml");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

    private synchronized void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

        } catch (IOException e) {
            Alerts.showAlert("Erro IOException", "Erro ao Carregar a View", e.getMessage(), AlertType.ERROR);
        }
    }

}
