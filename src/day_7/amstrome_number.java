package day_7;

public class amstrome_number {
	public static String amu(int num){
		int sum=0;
		int n;
		int p=num;
		while (num>0){
			n=num%10;
			sum=sum+n*n*n*n;
			num=num/10;
		
	
		}
		if (p==sum){
		return "armstrong";
	}
		else{
			return "not armstrong";
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(amu(1634));
	}
}
