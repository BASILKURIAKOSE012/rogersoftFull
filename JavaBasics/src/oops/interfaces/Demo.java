package oops.interfaces;

public class Demo implements FirstInterface,SecondInterface {

	

	@Override
	public void mySecondMethod() {
		// TODO Auto-generated method stub
		System.out.println("some text");
	}

	@Override
	public void myFirstMethod() {
		// TODO Auto-generated method stub
		System.out.println("some other text");
	}
	
	public static void main(String[] args) {
		FirstInterface f1 = new Demo();
		f1.myFirstMethod();
		SecondInterface f2 = new Demo();
		f2.mySecondMethod();
	}

}
