package day_7;

public class collatz_series {
	public static void main(String[]args){
		System.out.println(car(3));
	}
	public static String car( int num){
		int n=num;
		String result="";
		while (num>1){
			if (num%2==0){
				num=num/2;
				result+=""+num+"\n"; 
				
				}
			else {
				num=(num*3)+1;
					result+=""+n+"\n"+num+"\n";
				}
		}
		return result;
		}
	
	}
		
		
	