import java.util.Scanner;
public class InputOutputDemo {
	public static void main (String[] args)
	{
		int num1;
		float num2;
		double num3;
		char character;
		boolean bool;
		String str;


		Scanner in = new Scanner(System.in);

		System.out.print("Enter int value :  ");
		num1 = in.nextInt();

		System.out.print("Enter float value : ");
		num2 = in.nextFloat();

		System.out.print("Enter double value : ");
		num3 = in.nextDouble();

		System.out.print("Enter character value : ");
		character = in.next().charAt(0);

        System.out.print("Enter boolean value : ");
		bool = in.nextBoolean();

		System.out.print("Enter String value : ");
		str = in.nextLine();


		

		System.out.println("int ->  " +num1);
		System.out.println("float ->  " +num2);
		System.out.println("double ->  " +num3);
		System.out.println("character ->  " +character);
		System.out.println("boolean ->  " +bool);
		System.out.println("string ->  " +str);
	}
	
}