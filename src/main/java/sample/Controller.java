package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Controller {

    @FXML
    public TextArea originalText;

    @FXML
    public TextArea toReplaceText;

    @FXML
    public VBox replaceList;

    @FXML
    public Button check;

    @FXML
    public Button create;

    public void checkButton(ActionEvent actionEvent) {
        replaceList.getChildren().clear();
        String originalStr=originalText.getText();
        int n=0;
        while(originalStr.indexOf("\t")!=-1) {
            int i = originalStr.indexOf("\t");
            n++;
            replaceList.getChildren().add(new Label("第"+n+"个："));
            replaceList.getChildren().add(new TextField());
            originalStr = originalStr.substring(i+1);
        }
        System.out.println(n);
    }

    public void createButton(ActionEvent actionEvent) {
    }
}
