package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        Label label = new Label(message);
        Button button = new Button("Return");
        button.setOnAction(e -> window.close());
        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(label,button);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.setTitle(title);
        window.setMinWidth(250);
        window.showAndWait();

    }

}
