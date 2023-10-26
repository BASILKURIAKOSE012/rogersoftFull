package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is interesting";
		
		// contains method
		System.out.println(str.contains("is"));
		
		// equals method
		String str1 = "apple";
		String str2 = "mango";
		String str3 = "Apple";
		String str4 = "apple";
		System.out.println(str1.equals(str2) + " equals");
		System.out.println(str1.equals(str3)+ " equals");
		System.out.println(str1.equals(str4)+ " equals");
		System.out.println(str1.equalsIgnoreCase(str3)+ " equals");
		
		//compareTo
		
		System.out.println(str1.compareTo(str2)+ " compareTo");
		System.out.println(str1.equals(str3)+ " compareTo");
		System.out.println(str1.equals(str4)+ " compareTo");
		
		//upper case and lower case
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		//concat
		String str5 = str1.concat(",").concat(str2);
		System.out.println(str5);
		
		//join
		String str6 = String.join("-", str1,str2);
		System.out.println(str6);
		
		//split
		String [] str7 = str6.split("-");
		for(String f : str7) {
			System.out.println(f);
		}
		
		//substring
		System.out.println(str.substring(8));
		
		//trim
		String str8 = " coconut  ";
		System.out.println(str8.trim());
		
		
		
	}

}
