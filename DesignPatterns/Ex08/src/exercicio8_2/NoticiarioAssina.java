package exercicio8_2;

import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario {
	private List<Consumidor> consumidores = new ArrayList<Consumidor>();
	private Noticia noticia;

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.noticia = new Noticia(textoNoticia, dia, mes, topico);
		this.notificarConsumidores();
	};

	public void inscrever(Consumidor consumidor) {
		this.consumidores.add(consumidor);
		System.out.println(consumidor.getNome() + " se inscreveu ao noticiário \n");
	}

	public void notificarConsumidores() {
		System.out.println(" Notificar todos os consumidores ");
		for (Consumidor consumidor : this.consumidores) {
			consumidor.update();
		}
	}

	public Noticia getNoticia() {
		return this.noticia;
	}
}