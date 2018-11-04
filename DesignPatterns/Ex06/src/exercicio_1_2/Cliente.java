package exercicio_1_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	public static void main(String[] args) {
		String date = "22/10/2018";
		String produto = "Calzone";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		DayOfWeek dayOfWeek = LocalDate.parse(date, formatter).getDayOfWeek();
		
		int value = dayOfWeek.getValue();

		System.out.println(dayOfWeek);
		
		if(produto.equals("Pizza")) {
			PizzariaAbstractFactory pizzariaFactory = new PizzaFactory();
			Produto pizza = pizzariaFactory.getTypeInstance(String.valueOf(value));		
			pizza.printIngredientes();
			
		}else if(produto.equals("Calzone")){
			PizzariaAbstractFactory calzoneFactory = new CalzoneFactory();
			Produto calzone = calzoneFactory.getTypeInstance(String.valueOf(value));		
			calzone.printIngredientes();
		}			
	}
}
