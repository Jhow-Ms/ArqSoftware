package exercicio_1_1;

public class HelloWorldPrinterFactory implements AbstractWorldPrinterFactory {
	public static final String SCREEN = "screen";
	public static final String FILE = "file";

	@Override
	public WorldPrinter getPrinterInstance(String printerType) {
		switch(printerType) {
		case SCREEN:
			return new HelloWorldPrinterScreen();
		case FILE:
			return new HelloWorldPrinterFile();
		}
		return null;
	}

}
