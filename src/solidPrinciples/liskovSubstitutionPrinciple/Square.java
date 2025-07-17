package solidPrinciples.liskovSubstitutionPrinciple;

public class Square implements Shape {
	
	private Double height;

	public double area() {
		return height*height;
	}

	public Square(Double height) {
		this.height = height;
	}

	public Square() {}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
}
