package exercicio9_1;

public class Slot5 implements Slot {
	private Slot slot;

	public Slot5() {
	};

	@Override
	public double recebeMoeda(int m) {
		if (m == 5) {
			System.out.println("-- Recebeu R$0,05");
			return 0.05;
		}else {
			return this.slot.recebeMoeda(m);
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}