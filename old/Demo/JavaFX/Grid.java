import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Grid extends Application {
	public class CellParent extends Parent {
		public Rectangle rect;
		public CellParent(){
			this.rect = new Rectangle();
			this.rect.setFill(Color.BLACK);
			this.rect.setX(0);
			this.rect.setY(0);
			this.getChildren().add(this.rect);
		}
	}
	public class GridParent extends Parent {
		private CellParent cells[][];
		private int I;
		private int J;

		public GridParent(){}
		public GridParent(int I, int J, double w, double h){
			this.cells = new CellParent[I][J];
			this.I = I;
			this.J = J;
			for(int i=0; i<I; i++)
				for(int j=0; j<J; j++) {
					CellParent c = new CellParent();
					c.rect.setWidth(w);
					c.rect.setHeight(h);
					this.cells[i][j] = c;
					this.getChildren().add(c);
				}
		}
		public void newSceneWidth(double width){
			if (width <= 0)
				return;
			double w = width/this.I;
			for(int i=0; i<I; i++)
				for(int j=0; j<J; j++) {
					Rectangle r = this.cells[i][j].rect;
					r.setWidth(w);
					r.setX(0);
					r.setTranslateX(i*w);
				}
		}
		public void newSceneHeight(double height){
			if (height <= 0)
				return;
			double h = height/this.J;
			for(int i=0; i<I; i++)
				for(int j=0; j<J; j++) {
					Rectangle r = this.cells[i][j].rect;
					r.setHeight(h);
					r.setY(0);
					r.setTranslateY(j*h);
				}
		}
	}

	public void help(Object o) {
		System.out.println(o.getClass().getName());
		for (Object i : o.getClass().getDeclaredFields())
			System.out.println(i);
		for (Object i : o.getClass().getMethods())
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		Application.launch(Grid.class, args);
	}
	@Override
	public void start(Stage primaryStage) {
		double W = 100;
		double H = 200;
		int w = 10;
		int h = 20;
		Group root = new Group();
		Scene scene = new Scene(root,W,H);
		GridParent gridparent = new GridParent(w,h,W/w,H/h);

		//help(gridparent);
		//help(scene);
		//help(primaryStage);
		scene.widthProperty().addListener(new ChangeListener<Number>() {
				@Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
					gridparent.newSceneWidth(newSceneWidth.doubleValue());
				}
			});
		scene.heightProperty().addListener(new ChangeListener<Number>() {
				@Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
					gridparent.newSceneHeight(newSceneHeight.doubleValue());
				}
			});
		
		primaryStage.setTitle("Grid");
		root.getChildren().add(gridparent);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}