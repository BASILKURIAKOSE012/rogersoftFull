package arrays;

public class Number {
	public static void main(String[] args) {
	       int[] num={-1,2,3,4,6};
	       int min=Integer.MAX_VALUE;
	       for(int i=0;i<num.length;i++)
	       {
	    	   System.out.println(num[i]);
	           if(num[i]>0 && num[i]<min)
	                 min=num[i];
	           
	       }
	       System.out.println(min);
}
	
}