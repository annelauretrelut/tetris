/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettetris;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Anne-Laure
 */
public class AffichageGrille extends Group {
    private Rectangle[][] matrice;
    private Grille grille;
    public final static int TAILLE_CASE=20;
    public AffichageGrille(Grille grille){
        this.grille=grille;
        matrice=new Rectangle[grille.getNblignes()][grille.getNbcolonnes()];
        for (int j=4;j<grille.getNblignes();j++){
            for (int k=0;k<grille.getNbcolonnes();k++){
                matrice[j][k]=new Rectangle(k*TAILLE_CASE,(j-4)*TAILLE_CASE,TAILLE_CASE,TAILLE_CASE);
                this.getChildren().add(matrice[j][k]);
                matrice[j][k].setFill(Color.TRANSPARENT);
                matrice[j][k].setStroke(Color.GREY);
            }
        }
    }
   
    
}
