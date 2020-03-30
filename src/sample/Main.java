package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;

public class Main extends Application {

    private final String windowTitle = "This it the title of the Window";
    private final double windowHeight = 300;
    private final double windowWidth= 300;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("Click Me");
        button1.setOnAction(e -> AlertBox.display("WARNING","YOU MADE A FAULT"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button1);

        Scene scene = new Scene(layout);

        stage.setTitle(windowTitle);
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
        stage.setScene(scene);
        stage.show();

    }
}
