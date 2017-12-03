package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		String FILE = "file:///Users/garyhealy/Desktop/robRian.mp4";
		Player player = new Player(FILE);
		Scene scene = new Scene(player, 620, 527, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
