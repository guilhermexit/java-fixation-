package entities;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter the height of the rectangle: ");
		x.height = sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		x.width = sc.nextDouble();
		
		
		double areaX = x.Area();
		double perimeterX = x.Perimeter();		
		double diagonalX = x.Diagonal();		
		
		System.out.println(areaX);
		System.out.println(perimeterX);
		System.out.println(diagonalX);

		
		sc.close();
	}

}
