import java.util.Scanner;

class BreakDemo {
	public static void main(String[] args) {
		int arr [] = {12,45,67,89,10};

		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the element to be searched : ");
		int target = in.nextInt();

		for(int i=0; i<5; i++){
			if(arr[i]==target){
				System.out.println(" Element Found !!! ");
				
				

			}
				
			
		}


	}
}