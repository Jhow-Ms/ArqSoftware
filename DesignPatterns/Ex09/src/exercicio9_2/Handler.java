package exercicio9_2;

public class Handler {
	private Handler handler;
	private String nome;
	private long lastProcess;
	
	public void processa() {
		long newTime = System.currentTimeMillis();
		if (newTime - this.lastProcess < 3) {
			System.out.println("** Handler "+nome+" ocupado. Enviando para Handler "+this.handler.getNome());
			this.handler.processa();
		}else {
			this.lastProcess = newTime;
			System.out.println("-- Handler "+nome+" processou.");
		}
	};
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public String getNome() {
		return this.nome;
	}

	public Handler(String nome) {
		super();
		this.nome = nome;
	}

	public Handler(Handler handler, String nome) {
		super();
		this.handler = handler;
		this.nome = nome;
	}
	
}