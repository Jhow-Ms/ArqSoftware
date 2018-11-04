package exercicio_2_1;

public abstract class DisplayService {
	public void display() {
		NomeParser parser = getParser();
		String msg = parser.parse();
		System.out.println(msg);
	}
	
	protected abstract NomeParser getParser();
}
