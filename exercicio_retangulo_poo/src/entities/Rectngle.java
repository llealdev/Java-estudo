package entities;

public class Rectngle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		double square = (width * width) + (height * height);
		return Math.sqrt(square);
	}

}