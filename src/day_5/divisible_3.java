package day_5;

public class divisible_3 {
	public static boolean div_3(int n){
		if (n%3==0){
			return true;}
	    else{
				return false;
		}
		
	}
	public static boolean div_5(int n){
		if (n%5==0){
			return true;
		}
		else{
			return false;
		}
	}
 public static void main(String[] args) {
	System.out.println(div_3(15));
	System.out.println(div_3(10));
	System.out.println(div_5(10));
	
	
	
	
}
}
