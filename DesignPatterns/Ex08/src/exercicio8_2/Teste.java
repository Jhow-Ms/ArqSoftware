package exercicio8_2;

public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		new Consumidor("Vinicius", noticiario);
		noticiario.notificaNoticia(" A apple ira lançar o novo Iphone ", 28, 10, "Assunto tecnologia");
		
		new Consumidor("Lucas", noticiario);
		noticiario.notificaNoticia("O valor custara 10 mil reais  ", 30, 10, " Assunto tecnologia");

	}
}