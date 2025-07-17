package solidPrinciples.liskovSubstitutionPrinciple;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Square(15.0);
		System.out.println(shape.area());
		
		shape = new Rectangle(15.0, 20.0);
		System.out.println(shape.area());
	}
}
