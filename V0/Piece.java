package V0;

import javafx.scene.shape.Rectangle;

public class Piece {
	public int x, y;
	public Rectangle rect;

	public Piece(){
		this.rect = new Rectangle(10,10);
	}

 	private boolean cantranslateV(boolean grille[][], int w, int h) {
		return y+1<h && grille[x][y+1] == false;
	}

	public boolean translateV(boolean grille[][], int w, int h){
		if (cantranslateV(grille,w,h)) {
			y+=1;
			rect.setY(y*h);
			return true;
		}
		return false;
	}
}