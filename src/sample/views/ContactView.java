package sample.views;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContactView extends View{

    private TextField naamField;
    private TextField emailField;
    private DatePicker geboortedatumPicker;
    private TextField telefoonNummerField;
    private TextArea adresArea;
    private ComboBox<String> groepBox;
    private ListView<String> contactList;

    private VBox layout;
    private GridPane gridTop;
    private HBox hboxBottom;

    @Override
    public Parent getRoot() {
        return root;
    }
    public ContactView(){
        initLayout();
    }

    public void initLayout() {
        Label naamLabel = new Label("Naam: ");
        naamField = new TextField();
        Label emailLabel  = new Label("Email: ");
        emailField = new TextField();
        Label geboortedatumLabel  = new Label("Geboortedatum: ");
        geboortedatumPicker = new DatePicker();
        Label telefoonNummerLabel  = new Label("Telefoonnummer: ");
        telefoonNummerField = new TextField();
        Label adresLabel  = new Label("Adres: ");
        adresArea = new TextArea();
        Label groepLabel  = new Label("Groep: ");
        groepBox = new ComboBox<>();
        groepBox.getItems().addAll("Familie","Vrienden","Zakelijk");

        gridTop = new GridPane();
        gridTop.setPadding(new Insets(10,10,10,10));
        gridTop.setHgap(8);
        gridTop.setVgap(8);

        gridTop.add(naamLabel,0,0);
        gridTop.add(naamField,1,0);
        gridTop.add(emailLabel,0,1);
        gridTop.add(emailField,1,1);
        gridTop.add(geboortedatumLabel,0,2);
        gridTop.add(geboortedatumPicker,1,2);
        gridTop.add(telefoonNummerLabel,0,3);
        gridTop.add(telefoonNummerField,1,3);
        gridTop.add(adresLabel,0,4);
        gridTop.add(adresArea,1,4);
        gridTop.add(groepLabel,0,5);
        gridTop.add(groepBox,1,5);

        Button opslaanButton = new Button("Opslaan");
        opslaanButton.setPrefWidth(800);
        opslaanButton.setAlignment(Pos.BOTTOM_CENTER);

        contactList = new ListView<>();
        contactList.getItems().addAll(
                "Omer Citik 0686789873 omer.citik@hva.nl",
                "Jan Haas 0686789873 omer.citik@hva.nl",
                "Ahmad Makoe 0686789873 omer.citik@hva.nl"
        );
        contactList.setPrefWidth(200);
        contactList.setTranslateY(5);
        contactList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button nieuwButton = new Button("Nieuw");
        nieuwButton.setPrefWidth(200);
        Button verwijderenButton = new Button("Verwijderen");
        verwijderenButton.setPrefWidth(200);
        Button overzichtButton = new Button("Terug Naar Overzicht");
        overzichtButton.setPrefWidth(200);

        hboxBottom = new HBox(40);
        hboxBottom.setTranslateY(8);
        hboxBottom.setAlignment(Pos.CENTER);
        hboxBottom.getChildren().addAll(nieuwButton,verwijderenButton,overzichtButton);

        layout= new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(gridTop,opslaanButton,contactList,hboxBottom);
        root=layout;
    }
}
