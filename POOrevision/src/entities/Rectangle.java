package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	
	public double Area() {
		return width * height;
		
	}
	public double Perimeter() {
		return width + width + height + height;
	}
	public double Diagonal() {
		return Math.sqrt(height * height + width * width);
	}
}
