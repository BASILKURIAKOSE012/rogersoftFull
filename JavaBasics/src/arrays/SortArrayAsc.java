package arrays;

public class SortArrayAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {80,20,70,10,60};
		
		
		for(int i =0;i<4;i++) {
			
				int temp=0;
				if(numbers[i]>numbers[i+1]) {
					temp=numbers[i+1];
					numbers[i+1]=numbers[i];
					numbers[i]=temp;
				}
			
			
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
