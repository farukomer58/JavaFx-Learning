package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.views.ContactView;
import sample.views.GroepView;
import sample.views.View;

public class MainApplication extends Application {

    private String TITLE = "Practicumopdracht OOP2 - Omer Citik";
    private int WIDTH = 700;
    private int HEIGHT = 500;

    @Override
    public void start(Stage stage) throws Exception {

        /*GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label usernameText = new Label("Username: ");
        GridPane.setConstraints(usernameText,0,0);

        TextField usernameInput = new TextField("Farulex");
        GridPane.setConstraints(usernameInput,1,0);

        Label passwordText = new Label("Password: ");
        GridPane.setConstraints(passwordText,0,1);

        TextField passwordInput = new TextField();
        passwordInput.setPromptText("Password");
        GridPane.setConstraints(passwordInput,1,1);

        Button button = new Button("Login");
        GridPane.setConstraints(button,1,2);

        grid.getChildren().addAll(usernameText,usernameInput,passwordText,passwordInput,button);*/

        View view = new GroepView(); //Om Groepview te zien verander 'new ContactView();' naar 'new GroepView();'
        Scene scene = new Scene(view.getRoot());

        stage.setScene(scene);
        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        stage.show();
    }
}
