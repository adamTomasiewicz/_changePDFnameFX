package changePDFnameFX.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static changePDFnameFX.library.Constans.APP_VERSION;

public class MainController {

    @FXML
    public MenuItem closeItem;
    @FXML
    public MenuItem newExchangeItem;

    @FXML
    public void initialize() {

    }

    @FXML
    public void newExchange() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bin/exchange-screen.fxml"));
        try {
            StackPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(APP_VERSION);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void exit() {
        Platform.exit();
    }
}
