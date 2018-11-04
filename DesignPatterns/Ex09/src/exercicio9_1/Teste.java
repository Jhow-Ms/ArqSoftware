package exercicio9_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		NumberFormat f = new DecimalFormat("#0.00");
		
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot25 = new Slot25();
		Slot slot50 = new Slot50();
		Slot slot100 = new Slot100();
		slot5.setSlot(slot10);
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot100);
		
		double preco = 0;
		String item = JOptionPane.showInputDialog("Preços (1) Coxinha - R$2,00; (2) Refrigerante Lata - R$4,50; (3) Pastelziho - R$0,75");
		switch (item) {
		case "1":
			preco = 2.00;
			break;
		case "2":
			preco = 4.50;
			break;
		case "3":
			preco = 0.75;
			break;
		default:
			System.out.println("Produto invalido");
				
		}
		double inserido = 0;
		if (preco > 0) {
			while (preco>inserido) {
				System.out.println("-- Total inserido: R$"+f.format(inserido));
				double nova = slot5.recebeMoeda(Integer.parseInt(JOptionPane.showInputDialog("Insira uma moeda (5, 10, 25, 50, 100)")));
				inserido +=nova;
			}
			double troco = inserido - preco;
			System.out.println("Total a pagar:  R$"+f.format(preco));
			System.out.println("Total inserido: R$"+f.format(inserido));
			System.out.println("Troco:          R$"+f.format(troco));
		}
		

	}

}