import java.util.*;
public class Fibo {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		System.out.print("0 1");
		int a=0,b=1,sum=0;
		for(int i=3;i<=num;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
	}
}
