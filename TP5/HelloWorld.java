import java.awt.Graphics;
import javax.swing.JPanel;

class HelloWorld extends JPanel {
	// panneau dans lequel on peut dessiner
	protected void paintComponent(Graphics g) {
		IterateurSymbole i = new IterateurSymbole(Code39.code("MOUTON"));
		char current;
		int e, n, x, y;
		x = 100;
		y = 100;
		Symbole s;
		while(i.hasNext()){
			current = i.next();
			e = Character.getNumericValue(current);
			n = i.getState();
			s = new Symbole(e,n);
			s.draw(g, x, y);
			x += s.getWidth();
		}
	}
}
