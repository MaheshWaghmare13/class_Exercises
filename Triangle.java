import java.util.Scanner;
import java.lang.Math;
public class Triangle{
    public static void main(String [] args)
    {
       int a,b,c;
        

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the side 1 of Triangle:");
        a=sc.nextInt();
        System.out.println("Enter the side 2 of Triangle:");
        b=sc.nextInt();
        System.out.println("Enter the side 3 of Triangle:");
        c=sc.nextInt();

        	double S= (float)(a+b+c)/2;
        	System.out.println(" s="+S);
        	double area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
       
        

        System.out.println("Area of Circle is:"+ area);
        sc.close();

    }


}
