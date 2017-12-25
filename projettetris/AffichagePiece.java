package projettetris;

/**
 *
 * @author Anne-Laure
 */
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import static projettetris.AffichageGrille.TAILLE_CASE;

public class AffichagePiece extends Group {

    private Rectangle[][] matrice;
    private Piece piece;

    public AffichagePiece(Piece piece) {
        String I = new String();
        this.piece=piece;
        matrice = new Rectangle[4][4];
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (piece.getTab()[j][k] == true) {

                    matrice[j][k] = new Rectangle((k + 3) * TAILLE_CASE, (j-3) * TAILLE_CASE, TAILLE_CASE, TAILLE_CASE);/*on insere le tetrimino en haut de la grille d'où le j-3*/
                    this.getChildren().add(matrice[j][k]);
                    matrice[j][k].setFill(piece.getCouleur());
                    matrice[j][k].setStroke(Color.GREY);
                }
            }
        }
    }

}
