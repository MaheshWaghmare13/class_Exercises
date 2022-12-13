import java.util.Scanner;


public class Temperature {

	public static void main(String[] args) {
		float celsius ;
		double  fahrenheit;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temoerature is Celcius:");
		celsius= sc.nextInt();
		
		fahrenheit=1.8*celsius+32;
		System.out.println("The temperature in fahrenheit is:" +fahrenheit );
		
		sc.close();
		
		
	}

}
