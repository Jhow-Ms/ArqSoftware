package exercicio9_2;

public class Teste {

	public static void main(String[] args) {
		Handler h15 = new Handler("15");
		Handler h14 = new Handler(h15, "14");
		Handler h13 = new Handler(h14, "13");
		Handler h12 = new Handler(h13, "12");
		Handler h11 = new Handler(h12, "11");
		Handler h10 = new Handler(h11, "10");
		Handler h9 = new Handler(h10, "9");
		Handler h8 = new Handler(h9, "8");
		Handler h7 = new Handler(h8, "7");
		Handler h6 = new Handler(h7, "6");
		Handler h5 = new Handler(h6, "5");
		Handler h4 = new Handler(h5, "4");
		Handler h3 = new Handler(h4, "3");
		Handler h2 = new Handler(h3, "2");
		Handler h1 = new Handler(h2, "1");

		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
		h1.processa();
	}

}