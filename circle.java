// id  :  21CE084
// name :  kalp pandya
// Design a class named Circle containing following attributes and behavior.
//        • One double data field named radius. The default value is 1.
//        • A no-argument constructor that creates a default circle.
//        • A Single argument constructor that creates a Circle with the specified radius.
//        • A method named getArea() that returns area of the Circle.
//        • A method named getPerimeter() that returns perimeter of it.
import java.util.Scanner;

public class circle {
    private int radius;
    public circle()
    {
        radius = 5;
    }
    public circle(int r)
    {
        radius=r;
    }
    public float getArea()
    {
        float area = (float) ((3.14 * radius)*radius);
        return area;
    }
    public float getPerimeter()
    {
        float perimeter = (float) ((2 * 3.14)*radius);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle obj1 = new circle();
        System.out.print("enter the radius : ");
        int Radius = sc.nextInt();

        circle obj2 = new circle(Radius);
        System.out.println("the area of the circle is : " + obj1.getArea());
        System.out.println("the perimetter of the circle is : " + obj1.getPerimeter());
        System.out.println("the area of the circle is : " + obj2.getArea());
        System.out.println("the perimetter of the circle is : " + obj2.getPerimeter());
    }
}
