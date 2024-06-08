package pratice;

public class sumOf_n_Odd {
	public static int sumodd(int num){
		int sum=0;
	
		
				for(int i=1;i<=num;i++){
					if (i%2!=0){
						sum=sum+i;
						
					}
					
				}
				return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumodd(9));
		System.out.println(sum(5));
	}
public static int sum(int num){
	int sum=0;
	for (int i=1;i<=num;i++){
		sum=sum+i;
	}return sum;
}
}
