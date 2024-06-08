package day_5;
import java.util.*;
public class hotel_room {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("welcome to hotel ly");
System.out.println(" menu"+"\n"+ "1.delux room "+"\n"+"2.single room"+"\n"+"3.ac room");
System.out.println("enter the menu number :");
int menu1=sc.nextInt();
while (menu1>0){
	 
 if (menu1 ==1){
	System.out.println("1.instant booking"+"\n"+"2.normal booking");
	int book1=sc.nextInt();
	System.out.println("enter no days your staying");
	int day=sc.nextInt();
   if (book1==1){
	   System.out.println("cost of room + 20 percent  :"+(day)* (500+(500*0.21)));
   }
   else{
	   System.out.println("cost of room:"+(day*500));
   }
   }
 else if(menu1==2){
	 System.out.println("1.instant booking"+"\n"+"2.normal booking");
	 int book1=sc.nextInt();
	 System.out.println("enter no days your staying");
	 int day=sc.nextInt();
	 if (book1==1){
		 System.out.println("cost of room+10 persent :"+(day)*(200+(200*0.10)));
	 }
	 else{
		 System.out.println("cost of room :"+((day)*200));
	 }}
else if (menu1==3){
	System.out.println("1.instant booking"+"\n"+"2.normal booking");
	int book1=sc.nextInt();
	System.out.println("enter no days your staying");
	int day=sc.nextInt();
	 if (book1==1){
		   System.out.println("cost of room + 20 percent  :"+ (day)*(1000+(1000*0.21)));
	   }
	   else{
		   System.out.println("cost of room: "+(day)*1000);
	   }
	 }
 System.out.println("enter num of days staying :");
  
  
	  
  
 }}
}	


