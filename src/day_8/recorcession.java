package day_8;

public class recorcession {
	
	static int n1=0;
	static int n2=1;
	static int n3=0;
	public static int fib(int num){
	if (num<0) {
		return num;
	}
		
	}

	/*public static void fib(int num){
		if (num>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+num);
			fib(num-1);
		}
	}*/
	public static void main(String[] args) {
		
		System.out.println(fib(8));
	}}


