package sample.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GroepView extends View{

    private TextField naamField;
    private CheckBox favorietCheckbox;

    private ListView<String> groepList;

    private VBox layout;
    private GridPane gridTop;
    private HBox hboxBottom;

    @Override
    public Parent getRoot() {
        return root;
    }

    public GroepView() { initLayout(); }

    public void initLayout() {
        Label naamLabel = new Label("Naam: ");
        naamField = new TextField();
        Label favorietLabel = new Label("Is Favoriet: ");
        favorietCheckbox = new CheckBox();

        gridTop = new GridPane();
        gridTop.setPadding(new Insets(10, 10, 10, 10));
        gridTop.setHgap(8);
        gridTop.setVgap(8);

        gridTop.add(naamLabel, 0, 0);
        gridTop.add(naamField, 1, 0);
        gridTop.add(favorietLabel, 0, 1);
        gridTop.add(favorietCheckbox, 1, 1);

        Button opslaanButton = new Button("Opslaan");
        opslaanButton.setPrefWidth(800);
        opslaanButton.setAlignment(Pos.BOTTOM_CENTER);

        groepList = new ListView<>();
        groepList.getItems().addAll(
                "Familie is Favoriet",
                "Vrienden",
                "Zakelijk"
        );
        groepList.setPrefWidth(200);
        groepList.setTranslateY(5);
        groepList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button nieuwButton = new Button("Nieuw");
        nieuwButton.setPrefWidth(200);
        Button verwijderenButton = new Button("Verwijderen");
        verwijderenButton.setPrefWidth(200);
        Button overzichtButton = new Button("Terug Naar Overzicht");
        overzichtButton.setPrefWidth(200);

        hboxBottom = new HBox(40);
        hboxBottom.setTranslateY(8);
        hboxBottom.setAlignment(Pos.CENTER);
        hboxBottom.getChildren().addAll(nieuwButton, verwijderenButton, overzichtButton);

        layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(gridTop, opslaanButton, groepList, hboxBottom);
        root=layout;
    }
}
