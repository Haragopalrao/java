package day_5;

public class divisible_5 {
	public static String div(int n){
		 if (n%3==0 && n%5==0){
			return "fizz_buzz"; 
		}
       else if (n%3==0){
		return "fizz";
	}
	else if(n%5==0){
		return "buzz";
	
	}
	
	
	else{
		return "zero";
	}}
public static void main(String[] args){
		System.out.println(div(12));
		System.out.println(div(10));
		System.out.println(div(2));
		System.out.println(div(15));
		
	
}
}
