package exercicio8_2;

public class Consumidor {

	private NoticiarioAssina noticiario;
	private String nome;

	public Consumidor(String nome, NoticiarioAssina noticiario) {
		
		this.noticiario = noticiario;
		this.nome = nome;
		this.noticiario.inscrever(this);
	}

	public void update() {
		System.out.println(nome + " recebeu a notícia: " + noticiario.getNoticia().toString());
	}

	public String getNome() {
		return this.nome;
	}

}
