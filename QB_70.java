// `

import java.util.Scanner;

public class QB_70 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double circleArea = calculateCircleArea(radius);
        System.out.println("Area of the circle: " + circleArea);
        
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        double rectangleArea = calculateRectangleArea(length, width);
        double rectanglePerimeter = calculateRectanglePerimeter(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
        
        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        double triangleArea = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);
        
        scanner.close();
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
