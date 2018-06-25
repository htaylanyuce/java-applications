package sample;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;

public class Player extends BorderPane {

    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;
    Pane pane;

    public Player(String file){
        media = new Media(file);
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        pane = new Pane();

        pane.getChildren().add(mediaView);

        setCenter(pane);
        mediaPlayer.play();
    }
}
