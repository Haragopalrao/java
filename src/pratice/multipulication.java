package pratice;

public class multipulication {
	



	public static String mul(int num){
		String result="";
		for(int i=1;i<=20;i++){
			
			result +=num+"X "+(i)+" ="+(num*i)+"\n";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mul(9));
	}}


