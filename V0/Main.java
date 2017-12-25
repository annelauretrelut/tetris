package V0;

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
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setScene(scene);

		int h = 10;
		int w = 22;

		boolean Grille[][] = new boolean[w][h];
		Piece p = new Piece();
		root.getChildren().add(p.rect);

		scene.setOnKeyPressed(e->{
			switch (e.getCode()) {
				case UP:
				break;
				case DOWN:
					//TODO: when return false. create new piece.
					//TODO: when out of space, game over.
				p.translateV(Grille,w,h);
				System.out.println(p);
				break;
				case RIGHT:
				break;
				case LEFT:
				break;
			}
		});

		primaryStage.show();
	}
}
