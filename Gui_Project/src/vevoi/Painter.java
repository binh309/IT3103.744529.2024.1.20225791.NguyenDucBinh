package vevoi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root5791 = FXMLLoader.load(getClass().getResource("painter.fxml"));
        Scene scene5791 = new Scene(root5791);

        primaryStage.setTitle("Painter Application");
        primaryStage.setScene(scene5791);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
