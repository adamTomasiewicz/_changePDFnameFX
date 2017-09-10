package changePDFnameFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static changePDFnameFX.library.Constans.APP_VERSION;

public class ChangePDFnameFX_new extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/main-screen_new.fxml"));
        Group group1=new Group();
        StackPane stackPane = loader.load();
        group1.getChildren().add(stackPane);
        Scene scene1 = new Scene(group1, 800, 600);


        primaryStage.setScene(scene1);
        primaryStage.setTitle(APP_VERSION);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
