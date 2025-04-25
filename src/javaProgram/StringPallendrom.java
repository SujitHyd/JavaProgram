package javaProgram;

public class StringPallendrom {
	
	 
	public static void main(String[] args) {
		
	String str = "sujit";
	String newStr = "";
	
	for (int i = str.length()-1; i >=0; i--) 
	{
		
		char ch = str.charAt(i);
		
		newStr = newStr+ch;
		
	}
	
	System.out.println("New String -- "+ newStr);
	
	if (newStr.equalsIgnoreCase(str)) 
	{
		
		System.out.println(" Pallindrom");
	}
	else
	{
		System.out.println("Not Pallindrom");
	}
		
}
}


