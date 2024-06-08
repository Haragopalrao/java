package day_5;

public class age {
	public static boolean Checkage (int age){
		if (age>=18)
		{
			return true;
			}
		else {
			return false;
			}
		}
	
	public static void main(String[] args) {
		int age=21;
		System.out.println(Checkage(age));
	}

}
