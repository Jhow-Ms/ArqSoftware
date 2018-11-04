package exercicio_1_2;

public class CalzoneFactory implements PizzariaAbstractFactory{
	public static final String SEGUNDA = "1";
	public static final String TERCA = "2";
	public static final String QUARTA = "3";
	public static final String QUINTA = "4";
	public static final String SEXTA = "5";
	public static final String SABADO = "6";
	public static final String DOMINGO = "7";
	
	@Override
	public Produto getTypeInstance(String dayOfWeek) {
		
		if(dayOfWeek.equals(SEGUNDA) || dayOfWeek.equals(QUARTA) || dayOfWeek.equals(SEXTA))
			return new CalzoneCalabresa();
			
		if(dayOfWeek.equals(TERCA)|| dayOfWeek.equals(QUINTA) || dayOfWeek.equals(SABADO))
			return new CalzonePresunto();
		
		if(dayOfWeek.equals(DOMINGO))
			return new PizzariaFechada();
		
		return null;
	}
}
