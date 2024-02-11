
public class Program1 {
	public int AgeGroups(int a)
	{
		if(a>0 && a<12)
		{
			System.out.println("The age group comes under child");
		}
		else if(a>=13 && a<=19)
		{
			System.out.println("The age group comes under Teen");
		}
		else if(a>=20 && a<=59)
		{
			System.out.println("The age group comes under Adult"); 
		}
		else
		{
			System.out.println("Senior");
		}
		return a;
	}

}
