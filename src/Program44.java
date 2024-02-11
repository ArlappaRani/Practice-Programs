import java.util.Scanner;
public class Program44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side value"); 
		int side=scan.nextInt();
		System.out.println("Enter the length and breath value");
		int Len=scan.nextInt();
		int Bre=scan.nextInt();
		Program4 pr=new Program4();
		pr.Value(side, Len, Bre);

	}

}
