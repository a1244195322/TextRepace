package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane ap = (AnchorPane)FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("文本替换");
        primaryStage.setScene(new Scene(ap, 1200, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
