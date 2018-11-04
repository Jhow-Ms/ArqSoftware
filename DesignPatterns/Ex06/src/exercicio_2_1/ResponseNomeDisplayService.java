package exercicio_2_1;

public class ResponseNomeDisplayService extends DisplayService {
	
	@Override
	public NomeParser getParser () {
		return new Nome();
	}
}
