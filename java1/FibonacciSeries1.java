class FibonacciSeries1 {
	public static void main(String[] args) {

		int SERIES_COUNT = 10;

		int num1 = 0, num2 = 1;
		System.out.print(num1 +",  ");
		System.out.print(num2 +",  ");

		for(int i=3;i<=10;i++){
			int sum = num1+num2;
			num1=num2;
			num2=sum;

			if(i==SERIES_COUNT){
				System.out.print(sum);
			} else{
			    System.out.print(sum +",  ");
			  }
		} 
		 
		
		
	}
	
}