
public class Program4 {
	public int Value(int side,int Len,int bre)
	{
		if(side*side==Len*bre)
		{
			System.out.println("Rectangle is Square");
		}
		else
		{
			System.out.println("Rectangle is not Square");
		}
		int res=side*side;
		return res;
	}

}
