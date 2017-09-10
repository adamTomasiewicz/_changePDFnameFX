package changePDFnameFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ChangePDFnameFX_old extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main-screen_old.fxml"));
        primaryStage.setTitle("changePDFnameFX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setOpacity(0.95);
        primaryStage.setAlwaysOnTop(true);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

//set Stage boundaries to the lower right corner of the visible bounds of the main screen
        primaryStage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 600);
        primaryStage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - 500);
    }
    public static void main(String[] args) {
        launch(args);
    }


}