import java.awt.Graphics;

public enum Epaisseur {
	LARGE(5),
	ETROIT(2);
	
	private final int width, height;
	
	private Epaisseur(int width){
		this.width = width;
		this.height = 100;
	}
	
	public void draw(Graphics g, int x, int y){
		g.fillRect(x, y, width, height);
	}
	
	public int getWidth(){
		return width;
	}
	

}
