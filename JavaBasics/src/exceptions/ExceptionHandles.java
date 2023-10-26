package exceptions;

public class ExceptionHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c =0;
		a=20;
		b=0;
		int [] array = new int[3];
		try {
			c = a/b;
			System.out.println(c);
			array[3]=c;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e + " second number is zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally {
			System.out.println("try catch finished");
		}
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);

	}

}
