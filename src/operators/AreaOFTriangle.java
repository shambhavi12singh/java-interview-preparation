package operators;
import java.util.Scanner;

public class AreaOFTriangle {
	public static void main(String args[]) {
		float base, height , area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		base = sc.nextFloat();
		System.out.println("Enter height");
		height = sc.nextFloat();
		area = (base*height)/2;
		System.out.println("The area of triangle is "+ area);
		
	}

}
