public class IterateurSymbole {
	private String s;
	private int acc, len;
	private boolean state;
	
	public IterateurSymbole(String s){
		this.s = s;
		this.len = s.length();
		acc = 0;
		state = true;
	}
	
	private void changeState(){
		state = !state;
	}
	
	public int getState(){
		if(state){ return 1; } else { return 0 ; }
	}
	
	public boolean hasNext(){
		return (acc) < len;
	}
	
	public char next(){
		acc = acc + 1;
		changeState();
		return s.charAt(acc-1);
	}
}
