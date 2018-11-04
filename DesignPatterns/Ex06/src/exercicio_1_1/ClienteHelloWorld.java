package exercicio_1_1;

public class ClienteHelloWorld {
	
	public static void main(String[] args) {
		ClienteHelloWorld cliente = new ClienteHelloWorld();
		AbstractWorldPrinterFactory[] factory = {new HelloWorldPrinterFactory(), 
				new GoodbyeWorldPrinterFactory()};		
		AbstractWorldPrinterFactory printerFactory = factory[cliente.sorteio()];
		
		String[] tipos = {HelloWorldPrinterFactory.FILE, HelloWorldPrinterFactory.SCREEN}; 
		WorldPrinter printer = printerFactory.getPrinterInstance(tipos[cliente.sorteio()]);
		printer.print();
	}
	
	public int sorteio() {
		return (int) Math.round(Math.random());
	}

}
