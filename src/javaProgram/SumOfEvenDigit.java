package javaProgram;

public class SumOfEvenDigit {

	public static void main(String[] args) {

		String str = "098765432123456789";
		int sum=0;
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			int digit = Character.getNumericValue(c);
			if (digit%2==0) {
				sum += digit;				
			}
						
		}
		System.out.println("Summation : " + sum);

	}

}
