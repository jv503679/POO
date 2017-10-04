public class IterateurSymbole {
	private final String s;
	private int acc, len;
	
	public IterateurSymbole(String s){
		this.s = s;
		this.len = s.length();
		acc = 0;
	}
	
	public boolean hasNext(){
		return acc < len;
	}
	
	public char next(){
		acc += 1;
		return s.charAt(acc - 1);
	}
	
	public int getAcc(){
		return acc;
	}
}
