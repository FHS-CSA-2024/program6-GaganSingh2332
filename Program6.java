//import stuff here!
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;  
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = numScanner.nextDouble();
        double diameter = radius * 2;
        
        double area = pi * (radius * radius);
        area += 0.05;
        int area1 = (int) (area * 1000);
        area =  (double) area1 / 1000;
        
        double circumference = 2 * pi * radius;
        circumference += 0.05;
        int circumference1 = (int) (circumference * 1000);
        circumference =  (double) circumference1 / 1000;
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumfrence of the circle = " + circumference);
        
        
        
        
        
        
        
    }
}
//Your code here

//Paste console output below:
/*
Enter the radius:

3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 41.337

The Circumference of the circle = 22.272

*/
