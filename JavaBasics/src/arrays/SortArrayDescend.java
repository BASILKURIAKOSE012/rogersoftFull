package arrays;

public class SortArrayDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = {80,20,70,10,60};
		
		
		for(int i =0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
			{
				int temp=0;
				if(numbers[i]<numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
			
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
