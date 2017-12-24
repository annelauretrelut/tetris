import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		Application.launch(HelloWorld.class, args);
	}
    
    @Override
    public void start(Stage primaryStage) {
	    primaryStage.setTitle("Hello World");
	    Group root = new Group();
	    Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);
	    Button btn = new Button();
	    btn.setLayoutX(100);
	    btn.setLayoutY(80);
	    btn.setText("Hello World");
	    btn.setOnAction(new EventHandler<ActionEvent>() {

			    public void handle(ActionEvent event) {
				    System.out.println("Hello World");
			    }
		    });
	    root.getChildren().add(btn);        
	    primaryStage.setScene(scene);

	    System.out.println(primaryStage.getClass().getName());
	    for (Object o : primaryStage.getClass().getDeclaredFields())
		    System.out.println(o);
	    for (Object o : primaryStage.getClass().getMethods())
		    System.out.println(o);

	    primaryStage.show();
    }
}