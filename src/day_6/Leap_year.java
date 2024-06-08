package day_6;

public class Leap_year {
	public static String leap(int num){
		
		if (num%4==0 ){
			return " leap year";
		}
		else{
			return "not leap year";
		}
	}
private static int String(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
public static void main(String[]args){
	System.out.println(leap(2004));
	System.out.println(leap(2016));
	System.out.println(leap(2020));
	System.out.println(leap(2006));
}
}
