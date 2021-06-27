import java.util.*;
public class Prime {
	public static void main(String args[]) {
		System.out.println("Please insert any number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int cnt=0;
		if(num>0) {
		for(int i=2;i<num;i++) {
			if(num%i==0)
				cnt++;
		}
		if(cnt==0&&num!=1) {
			System.out.println(num+" is a prime number");
		}
		else
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println("negative numbers cant be prime");
		}
	}
}
