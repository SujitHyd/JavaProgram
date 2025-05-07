package classreference;

public class ReferenceTest {

	String name;
	String add;
	byte age;
	short SSN;
	
	public static void main(String[] args) {
		ReferenceTest cf = new ReferenceTest();
		cf.name = "Sujit";
		cf.add = "Delhi";
		cf.age = 35;
		cf.SSN = 5555;
		
		System.out.println(cf.name + "---" + cf.add + "----" + cf.age + " ----" + cf.SSN);
		
		ReferenceTest cf1 = new ReferenceTest();
		cf1.name = "Kesev";
		cf1.add = "Hyderabad";
		cf1.age = 40;
		cf1.SSN = 6666;
		System.out.println(cf1.name + "---" + cf1.add + "----" + cf1.age + " ----" + cf1.SSN);
		ReferenceTest cf2 = new ReferenceTest();
		cf2.name = "Jatin";
		cf2.add = "Bengaluru";
		cf2.age = 20;
		cf2.SSN = 7777;
		System.out.println(cf2.name + "---" + cf2.add + "----" + cf2.age + " ----" + cf2.SSN);
		ReferenceTest cf3 = new ReferenceTest();
		cf3.name = "Abhi";
		cf3.add = "Kerala";
		cf3.age = 40;
		cf3.SSN = 8888;
		System.out.println(cf3.name + "---" + cf3.add + "----" + cf3.age + " ----" + cf3.SSN);
		
		System.out.println("************************************************");
		
		cf=cf1;
		
		System.out.println(cf.name + "---" + cf.add + "----" + cf.age + " ----" + cf.SSN);//Kesav
		cf1=cf2;
		System.out.println(cf1.name + "---" + cf1.add + "----" + cf1.age + " ----" + cf1.SSN);//jatin
		cf2=cf3;
		System.out.println(cf2.name + "---" + cf2.add + "----" + cf2.age + " ----" + cf2.SSN);//abhi
		cf3=cf;
		System.out.println(cf3.name + "---" + cf3.add + "----" + cf3.age + " ----" + cf3.SSN);//kesav
		
		cf2=cf3;
		System.out.println(cf2.name + "---" + cf2.add + "----" + cf2.age + " ----" + cf2.SSN);// kesav
		
		
		cf=cf2;
		System.out.println(cf.name + "---" + cf.add + "----" + cf.age + " ----" + cf.SSN);//kesav
		

	}

}
