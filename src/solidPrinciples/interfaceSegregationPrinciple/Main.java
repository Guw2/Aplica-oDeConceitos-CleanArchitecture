package solidPrinciples.interfaceSegregationPrinciple;

public class Main {
	
	public static void main(String[] args) {
		
		Document document = new Document();
		document.setContent("Conteúdo");
		
		Printer printer = new SimplePrinter();
		Scanner scanner = new ComplexPrinter();
		
		printer.print(document);
		scanner.scan(document);
		
	}

}
