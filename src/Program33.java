import java.util.Scanner;
public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Products Number ");
        String  Product=	scan.nextLine();
        Program3 pr=new Program3();
        pr.Machine(Product);

	}

}
