import javafx.application.Application;
import javafx.stage.Stage;

public class Grid extends Application {
	public static void main(String[] args) {
		Application.launch(Grid.class, args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Grid");
		primaryStage.show();
	}
}