package day_5;

public class reverseOfnum {
	/*public static double discount(int bill) {
		
		if (n>1000)
		{
			System.out.println("discount"+ n*(10/100));
		}
		else{
			System.out.println("no discount");
		}
	} 
	public static void main(String[] args){
	 System.out.println(discount(199);
	}*/
	public static double  rev (int n){
		int sum1=0;
		while(n!=0){
		int  r=n%10;
		 sum1= sum1*10+r;
		  n=n/10;
		}
		
			return sum1;
			
		
	}
public static void main(String[] args) {
	System.out.println(rev(12));
}
}
