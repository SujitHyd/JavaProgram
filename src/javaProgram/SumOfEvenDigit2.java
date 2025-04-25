package javaProgram;

public class SumOfEvenDigit2 {

	public static void main(String[] args) {
		
		long num = 12345678987654321L;
		int sum=0;
		while (num>0) {
			
			long digit = num%10;
			if (digit%2==0) {
				sum +=digit;
								
			}
			num /=10;
		}
		System.out.println("Summation : " + sum);

	}

}
