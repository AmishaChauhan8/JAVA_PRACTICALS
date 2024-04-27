// write a program that displays the area and perimeter of a circle that has a radius 
// of 5 using the following formula: perimeter = 2 * radius * pi area = radius * 
// radius * pi in java 

public class QB_69 {
    public static void main(String[] args) {

        double radius = 5.0;
        double pi = Math.PI;
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;
        
        System.out.println("Circle Properties:");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
