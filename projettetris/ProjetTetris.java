/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettetris;

import java.util.ArrayList;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author Zinedine
 */
public class ProjetTetris extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        Pane pane = new Pane();
        root.setCenter(pane);
        HBox bas = new HBox(20);
        root.setBottom(bas);
        
        root.setPrefSize(10, 22);
        
        
        Button bt1 = new Button("Bt1");
        Button bt2 = new Button("Bt2");
        bt1.setDisable(true);
        
        bas.setAlignment(Pos.CENTER);
        bas.getChildren().addAll(bt1,bt2);
        
        Text txt = new Text("TETRIS");
        txt.setLayoutX(200);
        txt.setLayoutY(20);
        pane.getChildren().add(txt);
        
        Rectangle rect = new Rectangle(0,0,4,4);
        rect.setStroke(Color.color(0.5,1,1,0.5));
        rect.setFill(Color.color(1,0,0,0.5));
        
        
        Piece piece=new Piece(1, "I");
        
        Grille grille= new Grille(new Color[26][10], piece,  new ArrayList<>());
        AffichageGrille affichage=new AffichageGrille(grille);
        pane.getChildren().add(affichage);
        
        AffichagePiece affichagep= new AffichagePiece(piece);
        pane.getChildren().add(affichagep);
        
        
        MenuItem it1 = new MenuItem("item 1");
        
        Menu menu1 = new Menu("M1");
        menu1.getItems().add(it1);
        Menu menu2 = new Menu("M2");
        
        MenuBar mb = new MenuBar();
        mb.getMenus().add(menu1);
        mb.getMenus().add(menu2);
        
        root.setTop(mb);
        Scene scene = new Scene(root,300,250);
        
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(500),
            ae->{
                rect.setY(rect.getY()+1);
            }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        bt2.setOnAction((event) -> {
            timeline.play();
            bt1.setDisable(false);
            bt2.setDisable(true);  
        });
        bt1.setOnAction((event) -> {
            timeline.pause();
            bt2.setDisable(false);
            bt1.setDisable(true);
        });
        
        scene.setOnKeyPressed(e->{
            switch (e.getCode()) {
                case UP:
                    timeline.setRate(timeline.getRate()+1);
                    break;
                case DOWN:
                    rect.setRotate(rect.getRotate()+90);
                    break;
                case RIGHT:
                    rect.setX(rect.getX()+5);
                    break;
                case LEFT:
                    rect.setX(rect.getX()-5);
            }
        });
        
 
        primaryStage.setTitle("TETRIS GAME");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

