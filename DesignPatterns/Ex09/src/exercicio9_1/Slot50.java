package exercicio9_1;

public class Slot50 implements Slot {

	private Slot slot;

	public Slot50() {
	};

	@Override
	public double recebeMoeda(int m) {
		if (m == 50) {
			System.out.println("-- Recebeu R$0,50");
			return 0.5;
		}else {
			return this.slot.recebeMoeda(m);
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}