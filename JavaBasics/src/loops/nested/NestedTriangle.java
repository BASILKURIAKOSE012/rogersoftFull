package loops.nested;

public class NestedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k =1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				
				System.out.print(k++ +" " );
			}
			System.out.println();
		}
	}

}
