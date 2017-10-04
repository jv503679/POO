import java.awt.Graphics;
import javax.swing.JPanel;

class HelloWorld extends JPanel {
	private static final Epaisseur[] epaisseurs = {Epaisseur.ETROIT, Epaisseur.LARGE};
	private static final Nature[] natures = {Nature.ESPACE, Nature.BARRE};
	
	private void drawBarCode(Graphics g, String code, int x, int y){
		IterateurSymbole i = new IterateurSymbole(Code39.code(code));
		int e, n;
		Symbole s;
		while(i.hasNext()){
			e = Character.getNumericValue(i.next());
			n = i.getAcc() % 2;
			s = new Symbole(epaisseurs[e], natures[n]);
			s.draw(g, x, y);
			x += s.getWidth();
		}
	}
	
	protected void paintComponent(Graphics g) {
		drawBarCode(g, "MOUTON", 10, 10);
	}
}
