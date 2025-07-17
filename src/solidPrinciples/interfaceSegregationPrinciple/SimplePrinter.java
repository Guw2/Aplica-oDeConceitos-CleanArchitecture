package solidPrinciples.interfaceSegregationPrinciple;

public class SimplePrinter implements Printer{

	@Override
	public void print(Document document) {
		System.out.println("Printing... " + document.getContent());
	}

}
