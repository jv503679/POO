import java.awt.Graphics;

public class Symbole {
	private Epaisseur e;
	private Nature n;
	
	public Symbole(int e, int n){
		if(e == 0){ this.e = Epaisseur.ETROIT; } else { this.e = Epaisseur.LARGE ; }
		if(n == 0){ this.n = Nature.BARRE; } else { this.n = Nature.ESPACE ; }
	}
	
	public void draw(Graphics g, int x, int y){
		n.setColor(g);
		e.draw(g, x, y);
	}
	
	public int getWidth(){
		return e.getWidth();
	}
}
