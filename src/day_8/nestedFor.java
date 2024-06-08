package day_8;

public class nestedFor{
public static void main(String[] args) {
	/*for (int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			System.out.println(i+" "+j );
		}
	}*/
	for (int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			System.out.print( "*" );
		}
		System.out.println();
	}
}
}
