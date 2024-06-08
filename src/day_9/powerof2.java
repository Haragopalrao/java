package day_9;

public class powerof2 {
	public static boolean poweroftwo(int n){
		int n1=2;
		int n2=2;
		int n3=0;
		while(n>2){
			n3=n1*n2;
			n1=n2;
			n2=n3;
			
			n3=n;
			break;
		}
		if (n==n3){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(poweroftwo(78));
		
	}

}
