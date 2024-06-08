package day_1;
import java.util.Scanner;

public class Bio_data {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String a=sc.nextLine();
		System.out.println("enter your age");
		int b=sc.nextInt();
		System.out.println("enter your phone no:");
		long c=sc.nextLong();
		System.out.println("enter your email");
		String d=sc.next();
		System.out.println("enter your height");
		float f=sc.nextFloat();
		System.out.println("addres :");
		String e=sc.next();
		System.out.println("enter your gender (m or f)");
		char g=sc.next().charAt(0);
		System.out.println("enter your salary:");
		int h=sc.nextInt();
		System.out.println("maratial status(true or fals)");
		boolean i=sc.nextBoolean();
		System.out.println("name :"+(a)+"\n"+"age :"+(b)+"\n"+"phone no:"+(c)+"\n"+"email :"+(d)+"\n"+"adress:"+(e)+"\n"+"height :"+(f)+"\n"+"gender :"+(g)+"\n"+"salary :"+(h)+"\n"+"marriage status"+(i));
		}

}
