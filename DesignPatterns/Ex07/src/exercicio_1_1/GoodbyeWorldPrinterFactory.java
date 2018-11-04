package exercicio_1_1;

public class GoodbyeWorldPrinterFactory implements AbstractWorldPrinterFactory{

	public static final String SCREEN = "screen";
	public static final String FILE = "file";

	@Override
	public WorldPrinter getPrinterInstance(String printerType) {
		switch(printerType) {
		case SCREEN:
			return new GoodbyeWorldPrinterScreen();
		case FILE:
			return new GoodbyeWorldPrinterFile();
		}
		return null;
	}

}
