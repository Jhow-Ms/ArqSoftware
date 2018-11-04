package exercicio_2_1;

public class ResponseSobrenomeDisplayService extends DisplayService {
	
	@Override
	public NomeParser getParser () {
		return new Sobrenome();
	}
}
