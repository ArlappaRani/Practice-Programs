
public class Factorial {
	public int Value(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println(fact);
		return a;
	}

}
