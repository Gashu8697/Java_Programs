import java.util.Scanner;

class CalculatorUsingSwitchCaseStatement {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Number 1 :  ");
		int num1 = in.nextInt();

		System.out.println("Enter the Number 2 :  ");
		int num2 = in.nextInt();

		System.out.println("Enter an option from the following : ");
		System.out.println(" 1.Addition ");
		System.out.println(" 2.Subtraction ");
		System.out.println(" 3.Multiplication ");
		System.out.println(" 4.Division ");
		int option = in.nextInt();

		switch(option){
		case 1: System.out.println(num1 + num2);
			    break;
	    case 2: System.out.println(num1 - num2);
			    break;
	    case 3: System.out.println(num1 * num2);
			    break;
		case 4:
				if(num2==0){
					System.out.println("Cannot be divided");
				}else{
					System.out.println(num1/num2);
				}
				break;
		default: System.out.println("Wrong Option");

		}

   }
}