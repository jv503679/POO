import java.awt.Graphics;
import javax.swing.JPanel;

class HelloWorld extends JPanel {
	
	private void drawBarCode(Graphics g, String code, int x, int y){
		IterateurSymbole i = new IterateurSymbole(Code39.code(code));
		Symbole s;
		while(i.hasNext()){
			s = i.next();
			s.draw(g, x, y);
			x += s.getWidth();
		}
	}
	
	protected void paintComponent(Graphics g) {
		drawBarCode(g, "MOUTON", 10, 10);
	}
}
