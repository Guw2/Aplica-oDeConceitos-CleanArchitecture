package solidPrinciples.interfaceSegregationPrinciple;

public class ComplexPrinter implements Printer, Scanner, Fax{

	@Override
	public void fax(Document document) {
		System.out.println("Fax... " + document.getContent());
	}

	@Override
	public void scan(Document document) {
		System.out.println("Scanning... " + document.getContent());
	}

	@Override
	public void print(Document document) {
		System.out.println("Printing... " + document.getContent());
	}

}
