import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle");
		double Len=scan.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		double Bre=scan.nextDouble();
		Program10 pr=new Program10();
		pr.calculateRectangleArea(Len,Bre);

	}

}
