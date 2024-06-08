package day_8;

public class perfect_num {
	public static String per(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if (num%i==0){
				sum=sum+i;
			}}		
		
		if (sum==num ){
		return "perfect num";
	
	}
		else{
			return "not perfect num";
		}
	}
	public static void main(String[]args){
		System.out.println(per(28));
	}

}
