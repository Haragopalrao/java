package day_8;

public class coutn {
	public static  int co(int num){
		int count=0;
		for (int i=num;i!=0;i=i/10){
			count++;
		}
		return count;
	}
	public static  boolean amo(int num){
		int sum=0;
		int p=num;
		int n;
		int count=co(num);
		
		while (num>0){
			n=num%10;
			sum=(int) (sum+Math.pow(n, count));
			num=num/10;
			}
		
		if (sum==p){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(co(1634));
		System.out.println(amo(153));
		
	}

}
