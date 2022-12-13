import java.util.*;
public class Circle{
    public static void main(String [] args)
    {
        int r;
        double area,circumference;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Radius of Circle:");
        r=sc.nextInt();

        area=(Math.PI)*r*r;
        circumference=2*(Math.PI)*r;

        System.out.println("Area of Circle is:"+ area);
        System.out.println("Circumference of Circle is:"+ circumference);

        sc.close();
    }


}
