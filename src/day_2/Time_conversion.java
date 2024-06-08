package day_2;

public class Time_conversion {
	public static void main(String[] args) {
		
	
	int meter=5000;
	int hours=0*3600;
	int min=1*60;		
    int sec=1;
    float con=(hours+min+sec);
    float speed=(meter/con);
    System.out.println("per sec:"+speed);
    float speedhour=(float) ((speed)*3.6);
    float speedmin=(float) (speed*2.236936);
    System.out.println("per hour:"+(speedhour));
    System.out.println(speedmin);
	}
	}
    
    
