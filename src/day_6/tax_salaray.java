package day_6;

public class tax_salaray {
	public static int tax(int s){
		int har=100;int pf=50;
		int deduction=har+pf;
		int tax_incom=s-deduction;
		if (tax_incom>500000){
			return (int) (s-tax_incom*0.1);
		}
		else if (tax_incom>500000 && tax_incom<1000000){
			return (int) (s-tax_incom*0.2);
		}
		else{
			return (int)(s-tax_incom*0.3);
		}
		
	}
public static void main(String[]args){
	System.out.println(tax(450000));
}
}
