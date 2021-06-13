import java.util.*;

public class MatrixAddMul {
	public static void main(String ars[]) {
	int a[][]={{1,3,4},{2,4,3},{3,4,5}};
	int b[][]={{1,3,4},{2,4,3},{1,2,4}};
	Scanner s=new Scanner(System.in);
	
	if(a[1].length==b[0].length) {
		System.out.println("case 1: Add\ncase 2: Multiply ");
		int a1=s.nextInt();
		int c[][]=new int[a[0].length][b[1].length];
		switch(a1) {
		case 1 :
			for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<b[1].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();
		break;
		
		case 2:
			for (int i = 0; i < a[0].length; i++) {
				for (int j = 0; j < b[1].length; j++) {
					for (int k = 0; k < a[1].length; k++)
						c[i][j] += a[i][k] * b[k][j];
					System.out.print(c[i][j]+" ");
				}
			}
			System.out.println();
			break;
			
		default:
			System.out.println("Invalid");
			break;
		}
	}	
	}
}	
