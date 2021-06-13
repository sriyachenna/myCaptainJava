import java.util.*;
public class CalculateYrs {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	double minInYr=365*24*60;
	double min=s.nextDouble();
	long yrs=(long)(min/minInYr);
	int days=(int)(min/60/24)%365;
    System.out.println((int)min+" minutes is approximately "+yrs+" years and "+days+" days");

}
}
