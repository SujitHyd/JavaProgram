package javaProgram;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String str = "Sujit";
		String revStr = "";

		
		for (int i = str.length()-1; i >=0 ; i--) {
			
			char ch = str.charAt(i);
			revStr = revStr+ch;
			
			
		}
		
		System.out.println( "Reverse String : " + revStr);
		
		

	}

}
