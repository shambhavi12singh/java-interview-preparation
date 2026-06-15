package operators;

import java.util.Scanner;

public class AreaOfTriangleUsingThreeSides {

    public static void main(String[] args) {

        double side1, side2, side3, s, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of triangle");

        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

        s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Area of Triangle = " + area);

        sc.close();
    }
}