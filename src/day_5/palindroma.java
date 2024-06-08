package day_5;

public class palindroma {
	public static void main(String[] args) {
		int n=120;
		int sum1=n;
		int sum=0;
		while (n!=0){
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		
		System.out.println(sum);
		
		if(sum1 == sum){
			System.out.println(" palindrom");
		}
		else{
			System.out.println(" not palindrom");
		}
		
	}

}
