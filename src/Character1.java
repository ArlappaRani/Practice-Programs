import java.util.Scanner;
public class Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character value");
		char Letter=scan.next().charAt(0);
		Character ch=new Character();
		ch.Value(Letter);

	}

}
