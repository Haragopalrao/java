package day_2;

public class Type_Casting_Demo {

	public static void main(String[] args) {
	
		/*	int num=10;
		long num1=num;
		float num2=num1;		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		// TODO Auto-generated method stub*/
		//convert any higher data to lower data type with no loss
		 
		/*int a=10;
		byte b=(byte)a;
		System.out.println(b);*/
		
		byte x=2;
		int x1= 56;
		double x2=3455;
		int sum =(int) (x+ x1 +x2);
				System.out.println(sum);

	}

}
//type casting:
//coverting one data type to other is called type casting 
//there are two types of type casting they are implicit,and explecet
//implecit: if compailer converts one data type to other automatically than it is called implecit.here there is no data loss

//eplicit :if a bigger data type is converted in to smaller data type by programmer than it is called explicit.here data loss will take place