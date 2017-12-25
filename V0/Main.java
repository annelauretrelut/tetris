import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(Main.class, args);
	}
    
    @Override
    public void start(Stage primaryStage) {
	    primaryStage.setTitle("Tetris");
	    Group root = new Group();
	    Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);       
	    primaryStage.setScene(scene);

	    System.out.println(primaryStage.getClass().getName());
	    for (Object o : primaryStage.getClass().getDeclaredFields())
		    System.out.println(o);
	    for (Object o : primaryStage.getClass().getMethods())
		    System.out.println(o);

	    primaryStage.show();
    }
}