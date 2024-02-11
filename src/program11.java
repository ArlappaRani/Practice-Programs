import java.util.Scanner;
public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ages of persons");
		int Age=scan.nextInt();
		Program1 pr=new Program1();
		pr.AgeGroups(Age);

	}

}
