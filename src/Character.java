
public class Character {
	public char Value(char Letter)
	{
		if(Letter>='a'&& Letter<='z')
		{
			if(Letter=='a'||Letter=='e'||Letter=='i'||Letter=='o'||Letter=='u')
		{
			System.out.println("Lower-case Vowel");
		}
			else
			{
				System.out.println("Lower-case Consonant");
			}
		}
		else if(Letter>='A'&&Letter<='Z')
		{
			 if(Letter=='A'||Letter=='E'||Letter=='I'||Letter=='O'||Letter=='U')
		{
			System.out.println("Upper-case Vowel");
		}
			 else
			 {
				 System.out.println("Upper-case Consonant"); 
			 }
		}
		
		else if(Letter>='0'&& Letter<='9')
		{
			System.out.println("Digits");
			}
		else
		{
			System.out.println("Speciai Character");
		}
		return Letter;
	}

}
