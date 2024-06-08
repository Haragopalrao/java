package day_2;

public class Day_count {

	public static void main(String[] args) {
		
		/*int years=22*365;
		int month=8*30;
		int days=9;
		int total_days=years+month+days;
		System.out.println("total days :"+(total_days));*/
		
		int year=2001;
		int month=8;
		int date=10;
		//2002->2001->days
		int yearsdays=(2022-year)*365;
		int monthdays=month*30;
		int total_days=yearsdays+monthdays+date;
		System.out.println(total_days);
		
       
	}

}
