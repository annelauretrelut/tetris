package projettetris;

import javafx.scene.paint.Color;

public class Piece {

    private boolean tab[][] = new boolean[4][4];
    private int position;
    private Color couleur;
    private String tetrimino;

    public Piece(int position,String tetrimino) {
        
        this.position = position;
       
        this.tetrimino=tetrimino;
        majConfiguration();
       
    }

    @SuppressWarnings("empty-statement")
    public final void majConfiguration() {
        if (tetrimino.equals("I")) {
            switch (position) {
                case 1:
                    for (int k = 0; k <= 3; k++) {
                        tab[k][1] = true;
                        tab[k][0] = false;
                        tab[k][2] = false;
                        tab[k][3] = false;

                    }
                case 2:
                    for (int k = 0; k <= 3; k++) {
                        tab[1][k] = true;
                        tab[0][k] = false;
                        tab[2][k] = false;
                        tab[3][k] = false;
                    }
                case 3:
                    for (int k = 0; k <= 3; k++) {
                        tab[k][2] = true;
                        tab[k][0] = false;
                        tab[k][1] = false;
                        tab[k][3] = false;
                    }
                case 4:
                    for (int k = 0; k <= 3; k++) {
                        tab[2][k] = true;
                        tab[0][k] = false;
                        tab[1][k] = false;
                        tab[3][k] = false;
                    }

            }
        }
        if (tetrimino.equals("J")) {
            switch (position) {
                case 1:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {false, true, false, false},
                        {true, true, false, false}};

                    break;

                case 2:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, false, false},
                        {true, true, true, false},
                        {false, false, true, false}};

                    break;

                case 3:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, true, false},
                        {false, true, false, false},
                        {false, true, false, false}};

                    break;

                case 4:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {true, false, false, false},
                        {true, true, true, false},
                        {false, false, false, false}};

                    break;
            }

        }
        if (tetrimino.equals("L")) {
            switch (position) {
                case 1:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {false, true, false, false},
                        {false, true, true, false}};

                    break;

                case 2:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, true, false},
                        {true, true, true, false},
                        {false, false, false, false}};

                    break;

                case 3:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {true, true, false, false},
                        {false, true, false, false},
                        {false, true, false, false}};

                    break;

                case 4:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, false, false},
                        {true, true, true, false},
                        {true, false, false, false}};

                    break;
            }

        }
        if (tetrimino.equals("S")) {
            switch (position) {
                case 1:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, true, false},
                        {true, true, false, false},
                        {false, false, false, false}};

                    break;

                case 2:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {true, false, false, false},
                        {true, true, false, false},
                        {false, true, false, false}};

                    break;

                case 3:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, false, false},
                        {false, true, true, false},
                        {true, true, false, false}};

                    break;

                case 4:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {false, true, true, false},
                        {false, false, true, false}};

                    break;

            }
        }
        if (tetrimino.equals("O")) {
            tab = new boolean[][]{
                {false, false, false, false},
                {false, false, false, false},
                {true, true, false, false},
                {true, true, false, false},};

        }

        if (tetrimino.equals("T")) {
            switch (position) {
                case 1:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {true, true, true, false},
                        {false, false, false, false}};

                    break;

                case 2:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {true, true, false, false},
                        {false, true, false, false},};

                    break;

                case 3:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, false, false},
                        {true, true, true, false},
                        {false, true, false, false},};

                    break;

                case 4:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {false, true, true, false},
                        {false, true, false, false},};

                    break;
            }
        }
        if (tetrimino.equals("Z")) {
            switch (position) {
                case 1:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {true, true, false, false},
                        {false, true, true, false},
                        {false, false, false, false}};

                    break;

                case 2:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, true, false, false},
                        {true, true, false, false},
                        {true, false, false, false},};

                    break;

                case 3:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, false, false},
                        {true, true, false, false},
                        {false, true, true, false},};

                    break;

                case 4:
                    tab = new boolean[][]{
                        {false, false, false, false},
                        {false, false, true, false},
                        {false, true, true, false},
                        {false, true, false, false},};

                    break;
            }
        }
       
    }

    public boolean[][] getTab() {
        return tab;
    }

    public Color getCouleur() {
        if (tetrimino.equals("I")) {
            couleur = Color.color(0, 1, 1);
        }
        if (tetrimino.equals("J")) {
            couleur = Color.color(0, 0, 1);
        }
        if (tetrimino.equals("L")) {
            couleur = Color.color(1, 0.78, 0);
        }
        if (tetrimino.equals("O")) {
            couleur = Color.color(1, 1, 0);
        }
        if (tetrimino.equals("S")) {
            couleur = Color.color(0, 1, 0);
        }
        if (tetrimino.equals("T")) {
            couleur = Color.color(1, 0, 1);
        }
        if (tetrimino.equals("Z")) {
            couleur = Color.color(1, 0, 0);
        }
        return couleur;
    }

    public String getTetrimino() {
        return tetrimino;
    }

    public void setPosition(int pos) {
        position = pos;
        majConfiguration();
    }
    public int getPosition(){
        return position;
    }
}
