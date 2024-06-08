package day_5;

public class marks_Student {
	
	public static  String pow()
	{
		
		int s1=50;
		int s2=60;
		int s3=70;
		int s4=80;
		int s5=90;
		double  p=(s1+s2+s3+s4+s5)*100/500;
	
	if (p>90){
		return	"grade a"; 
			
			}
	else if(p>80 && p<90){
				return "grade b";
						}
	else if (p>70 && p<80){
		return"grade c";
		}
	else if(p>60 && p<70){
		return "grade d";
	}
	else{
		return "grade e";
	}

	}
 public static void main(String[] args) 
{
	
	System.out.println(pow());
}
  
	
	
  }

