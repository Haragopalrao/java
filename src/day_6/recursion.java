package day_6;

public class recursion {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=44;
   double m=n%10;
   double v=n/10;
   int sum= (int) (m+v);
   System.out.println(sum);
   
	}8*/
/*	public static int adding(int num){
		if(num==0){
			return num;
		}
		else{
			return num+adding(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(adding(5));
	}*/
	public static int factroal(int num){
		if (num==1){
			return num;
		}
		else{
			return num*1*factroal(num-1);
		}

	
}//
	
	
public static void main(String[] args) { 
	System.out.println(factroal(5));
	System.out.println(adding(568));
}
public static int adding(int num1){
	if (num1==0 ){
		return num1;
	}
	else if(num1!=0 ) {
		return (num1%10+adding(num1/10));
		      
		}
		
		else{
			return 0;
		}
	}
}

