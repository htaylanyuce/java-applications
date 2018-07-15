package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.Glow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 10, 10, 10));

        Label name = new Label("Name");
        TextField nameField = new TextField();
        Label birth = new Label("Date of the Birth");
        DatePicker birthField = new DatePicker();
        Label gender = new Label("Gender");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        Label reservation = new Label("Reservation");
        ToggleButton Reservation = new ToggleButton();
        ToggleButton yes = new ToggleButton("Yes");
        ToggleButton no = new ToggleButton("No");
        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);

        Label qualifications = new Label("Ed. qualifaction");

        ObservableList<String> names = FXCollections.observableArrayList(
                "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        ListView<String> listView = new ListView<String>(names);

        name.setStyle("-fx-font: normal bold 15px 'serif'; -fx-margin-bottom:50px; ");
        birth.setStyle("-fx-font: normal bold 15px 'serif' ");
        gender.setStyle("-fx-font: normal bold 15px 'serif' ");
        reservation.setStyle("-fx-font: normal bold 15px 'serif' ");
        qualifications.setStyle("-fx-font: normal bold 15px 'serif' ");

        root.add(name,0,0);
        root.add(nameField,1,0);
        root.add(birth,0,1);
        root.add(birthField,1,1);
        root.add(gender,0,2);
        root.add(male,1,2);
        root.add(female,2,2);
        root.add(reservation,0,3);
        root.add(yes,1,3);
        root.add(no,2,3);
        root.add(qualifications,0,4);
        root.add(listView,1,4);

        Scene scene = new Scene(root,500,500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration form");
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
