package day_8;

public class spy_num {
	

	public static String spy(int num){
	int sum=0;
	int pro=1;
	int last=0;
	while(num>0){
		last=num%10;
		sum=sum+last;
		pro=pro*last;
		num=num/10;
	}
	if(sum == pro){
		return "spy";
	}
	else{
		return"not spy";
	}
}
	public static void main(String[]args){
		System.out.println(spy(132));
	}

}
