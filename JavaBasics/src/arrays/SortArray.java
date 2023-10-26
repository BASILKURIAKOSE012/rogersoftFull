package arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {80,20,70,10,60};
		
		
		for(int i =0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
			{
				int temp=0;
				if(numbers[i]>numbers[j]) {
					System.out.println(numbers[i]);
					System.out.println(numbers[j]);
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
					System.out.println(numbers[i]);
					System.out.println(numbers[j]);
				}
			}
			
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
	

}
