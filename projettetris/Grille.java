package projettetris;

import javafx.scene.paint.Color;
import java.util.Random;
import java.util.ArrayList;

public class Grille {

    private Color[][] grille = new Color[26][10];
    private Piece pieceActuelle;
    private Random position;
    private ArrayList<int[]> positionPiece = new ArrayList<>();

    public Grille(Color[][] grille, Piece pieceActuelle, ArrayList positionPiece) {
        this.grille = grille;
        this.pieceActuelle = pieceActuelle;
        this.position = new Random(0);
        this.positionPiece = positionPiece;
    }

    public void insererTetrimino() {

        pieceActuelle.setPosition(position.nextInt(4));
        for (int i = 0; i < 4; i++) {
            for (int k = 3; k < 7; k++) {
                if (pieceActuelle.getTab()[i][k - 3] == true) {
                    grille[0][k] = pieceActuelle.getCouleur();
                    positionPiece.add(new int[]{i, k});
                }

            }

        }

    }

    public void descendreTetrimino() {
        for (int j = 0; j < positionPiece.size(); j++) {
            if (grille[positionPiece.get(j)[0] - 1][positionPiece.get(j)[1]] != null) {
                break;
            }
        }

        for (int j = 0; j < positionPiece.size(); j++) {
            grille[positionPiece.get(j)[0]][positionPiece.get(j)[1]] = null;
            grille[positionPiece.get(j)[0]][positionPiece.get(j)[1]] = null;
            positionPiece.set(j, new int[]{positionPiece.get(j)[0] - 1, positionPiece.get(j)[1]});
        }

    }

    public void translaterTetrimino(int direction) {
        /*direction 1:droite direction 2:gauche*/
        if (direction == 1) {
            for (int j = 0; j < positionPiece.size(); j++) {
                if (grille[positionPiece.get(j)[0]][positionPiece.get(j)[1] + 1] != null) {
                    break;
                }
            }
            for (int j = 0; j < positionPiece.size(); j++) {
                grille[positionPiece.get(j)[0]][positionPiece.get(j)[1]] = null;
                grille[positionPiece.get(j)[0]][positionPiece.get(j)[1] + 1] = pieceActuelle.getCouleur();
                positionPiece.set(j, new int[]{positionPiece.get(j)[0], positionPiece.get(j)[1] + 1});
            }

        }
        if (direction == 2) {
            for (int j = 0; j < positionPiece.size(); j++) {
                if (grille[positionPiece.get(j)[0]][positionPiece.get(j)[1] - 1] != null) {
                    break;
                }
            }
            for (int j = 0; j < positionPiece.size(); j++) {
                grille[positionPiece.get(j)[0]][positionPiece.get(j)[1]] = null;
                grille[positionPiece.get(j)[0]][positionPiece.get(j)[1] - 1] = pieceActuelle.getCouleur();
                positionPiece.set(j, new int[]{positionPiece.get(j)[0], positionPiece.get(j)[1] - 1});
            }
        }

    }
    public int getNblignes(){
        return grille.length;
    }
    public int getNbcolonnes(){
        return grille[0].length;
    }

}
