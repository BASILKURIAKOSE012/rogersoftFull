package basics;

public class New {

	public float check(float a) {
		return a/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		int b=35;
		int c=0;
		 New n1 = new New();
		 n1.check(35);
		 System.out.println(n1.check(35));
		
	}

}
