package exercicio_1_2;

public class PizzaPresunto implements Pizza {

	@Override
	public void printIngredientes() {
		System.out.println("Pizza de Presunto - Ingrediente: Queijo, Presunto e Tomate");	
	}

	@Override
	public String toString() {
		return "PizzaPresunto []";
	}
}
