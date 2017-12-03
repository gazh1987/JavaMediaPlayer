package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;

//HBox lays out its children in a horizontal row
public class MediaBar extends HBox
{
	Slider time = new Slider();
	Slider vol = new Slider();
	
	Button playButton = new Button("||"); //Play button set to pause
	Label volume = new Label("Volume: "); //Label for displaying text
	MediaPlayer player;
	
	public MediaBar(MediaPlayer play)
	{
		player = play;
		
		//Layout of HBox children
		setAlignment(Pos.CENTER);
		setPadding(new Insets(10, 10, 10, 10));
		
		//Volume slider width properties
		vol.setPrefWidth(70);
		vol.setMinWidth(30);
		vol.setValue(100); //Sets volume to full
		
		//Sets the time to be the width of the pane, taking up the rest of the available space 
		//will stay the width of the pane no matter what size the user expands the pane too
		HBox.setHgrow(time, Priority.ALWAYS); 
		
		//set width of play button
		playButton.setPrefWidth(30);
		
		//add the four new elements as children to the pane
		getChildren().add(playButton);
		getChildren().add(time);
		getChildren().add(volume);
		getChildren().add(vol);
		
	}
}
