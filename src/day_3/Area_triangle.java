package day_3;

public class Area_triangle {
	public static void main(String[] args) {
		float breath=2.5f;
		
		int s1=5,s2=6,s3=7;
		double s=(s1+s2+s3)/2;
		double b=s*(s-s1)*(s-s2)*(s*s3);
		double area=Math.sqrt(b);
		System.out.println("Area :"+(area));
		}

}
