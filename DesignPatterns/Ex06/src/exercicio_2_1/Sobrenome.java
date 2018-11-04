package exercicio_2_1;

public class Sobrenome implements NomeParser{
	
	@Override
	public String parse() {
		
		String nomes = "Fernandes, João";
		
		return nomes;
	}

}
