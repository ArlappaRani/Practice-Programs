import java.util.Scanner;
public class Program91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base and value");
        int Base=scan.nextInt();
        System.out.println("Enter the Exponent value");
        int Expo=scan.nextInt();
        Program9 pr=new Program9();
        pr.Power(Base,Expo);
        
	}

}
