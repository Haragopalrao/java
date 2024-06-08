package day_8;

public class ugly_num {
	

	public static String ugly(int num){
		int h=0;
		while (num>1){
		if (num%2==0)
			 num=num/2;
		
		else if (num%3==0)
			num=num/3;
		else if (num%5==0)
			num=num/5;
		
		else {
			h=1;
			break;
			}
		}
  if (h==0){
	return"ugly  ";
	
}
  else{
	  return "not ugly";
  }
  }
	public static void main(String[]args){
		System.out.println(ugly(12));
	}
}
