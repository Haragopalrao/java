package pratice;

public class sumOf_N_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumeven(5));
		System.out.println(proeven(5));

	}
	public static String sumeven(int num){
		String result="";
		int sum=0;
		for(int i=0;i<=num;i++){
			if (i%2==0)
				sum=sum+i;
			result =""+(sum);
		}
	return result;
	}
	public static String proeven(int num){
		String result="";
		int sum=1;
		for(int i=1;i<=num;i++){
			
				sum=sum*i;
			result =""+(sum);
		}
	return result;
	}
	
	}


