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
        Stage window = stage;

        // Make a Text Object
        Text text = new Text("Dit is een stukje text");

        // Make a Button object and translate it
        Button button = new Button("Click op me ik ben een knop");
        button.setTranslateY(-30);

        // Create StackPane layout and add to children
        StackPane layout = new StackPane();
        layout.getChildren().addAll(text,button);

        // Add layout to scene
        Scene scene = new Scene(layout,windowWidth,windowHeight);

        // Configure window/stage and  show
        window.setTitle(windowTitle);
        window.setScene(scene);
        window.show();

    }
}
