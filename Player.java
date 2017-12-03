package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane
{
	 
	Media media;
	MediaPlayer player;
	MediaView view;
	Pane mPane;
	MediaBar bar;
	
	public Player(String file)
	{
		 media = new Media(file); //Construct a media instance from file 
		 player = new MediaPlayer(media); //Create a player for the media instance 
		 view = new MediaView(player);  //Create a MediaView for the MediaPlayer
		 mPane = new Pane(); //Create a Pane Layout
		 mPane.getChildren().add(view); //Add the MediaView to the new Pane (MediaView when added becomes a child of Pane
		 setCenter(mPane);
		 
		 bar = new MediaBar(player); //Create the bottom control bar
		 setBottom(bar); //set the control bar as the bottom of the screen
		 setStyle("-fx-background-color: #bfc2c7");
		 player.play(); //play the media
	}
}
