package exercicio_1_2;

public class PizzaCalabresa implements Pizza {

	@Override
	public void printIngredientes() {
		System.out.println("Pizza de Calabresa - Ingrediente: Queijo, Calabresa e Tomate");		
	}

	@Override
	public String toString() {
		return "PizzaCalabresa []";
	}
}
