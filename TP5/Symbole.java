import java.awt.Graphics;

public class Symbole {
	private Epaisseur e;
	private Nature n;
	
	public Symbole(Epaisseur e, Nature n){
		this.e = e;
		this.n = n;
	}
	
	public void draw(Graphics g, int x, int y){
		n.setColor(g);
		e.draw(g, x, y);
	}
	
	public int getWidth(){
		return e.getWidth();
	}
}
