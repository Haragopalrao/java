package day_5;

public class oddoreven {
	public static String Eorodd(int n)
	{
		if (n==0){
			return "invalid";}
		else if(n%2==0){
				return "even";
			}
		else{
			return "odd";
		}
		
		}
	public static String odd(int num){
		return (num%3==0)?"even":"odd";
	}
	public static void main(String[]args){
		System.out.println(Eorodd(0));
		System.out.println(odd(4));
	}
	}

