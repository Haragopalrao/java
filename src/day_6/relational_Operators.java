package day_6;

public class relational_Operators {
	/*public static  String div(int num){
		if (num>0){
			if(num%5==0){
				return "it is div by 5";}
				else	{
					return "not div by 5";
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  int n=9;int m=10;
    // System.out.println(72&99);
    // if(n<m && m>n ){
    	 System.out.println(div(5));
    // }*/
    	public static  String mex(int a,int b,int c){
	//		int[] a={22,23,24};
		//	System.out.println(Math.max(a[]);
	
	if (a>b && a>c){
		return "a is max";
		} 
	else if (b>a && b>c){
		return"b is max";
		
	}
	else{
	return "c is max";
	}
	}
public static void main(String[]args){
	System.out.println(mex(33,44,55));
}}

