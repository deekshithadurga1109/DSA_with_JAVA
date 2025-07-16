//Question we have 
//Write a Program to check if a triangle is Equilateral, Isosceles, or Scalene. Any triangle is equilateral if all sides of the triangle are equal. If any of the two sides are equal, then Isosceles, otherwise, Scalene. 
// Input Format:
// First line, number like side -1 for triangle
// Second  line, number like side -2  for triangle
// Third  line, number like side -3 for triangle
// Output Format:
// Print Equilateral , Isosceles or Scalene



package SET1;
import java.util.Scanner;

public class TriangleTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking 3 sides of triangle as input
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        scanner.close();

        // Check if the input sides can form a valid triangle (optional but recommended)
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }
}

