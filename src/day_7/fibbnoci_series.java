package day_7;

public class fibbnoci_series {
	static int n1=0,n2=1,n3,i,num=10;    
	public static void main(String[] args) {
		 int n1=0,n2=1,n3,i,num=10;    
		    for(i=0;i<num;++i)  
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		 System.out.println(cor(33)); 
			
	}
	public static int cor(int num){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
		cor(num-1);
		return n3;
	}

}
