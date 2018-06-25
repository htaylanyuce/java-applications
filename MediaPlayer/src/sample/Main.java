package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Music Player");
        primaryStage.setWidth(600.0);
        primaryStage.setHeight(600.0);
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: black;");
        Scene scene = new Scene(gridPane);

        Button play = new Button();
        ScrollBar scrollBar = new ScrollBar();
        Player player = new Player("/home/hamit/Documents/video1.mp4");


        play.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        play.setText("Play");
        //gridPane.add(play,2,2);
        //gridPane.add(scrollBar,1,2);
        gridPane.add(player,0,0);


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
