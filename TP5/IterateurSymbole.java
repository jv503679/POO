public class IterateurSymbole {
	private final String str;
	private int acc, len;
	
	public IterateurSymbole(String str){
		this.str = str;
		this.len = str.length();
		acc = 0;
	}
	
	public boolean hasNext(){
		return acc < len;
	}
	
	public Symbole next(){
		int e = Character.getNumericValue(str.charAt(acc));
		int n = acc % 2;
		acc += 1;
		return new Symbole(Epaisseur.tab[e], Nature.tab[n]);
	}
}
