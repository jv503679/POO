import java.awt.Graphics;
import java.awt.Color;

public enum Nature {
	BARRE(new Color(0,0,0)),
	ESPACE(new Color(255,255,255));
	
	private final Color c;
	
	private Nature(Color c){
		this.c = c;
	}
	
	public void setColor(Graphics g){
		g.setColor(c);
	}

}