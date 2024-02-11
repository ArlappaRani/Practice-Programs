
public class Program3 {
	public String Machine(String  Num)
	{
		switch(Num)
		{
		case "p01" : System.out.println("Pepsi");
		           break;
		case "p02" : System.out.println("Maggi");  
		           break;
		case "p03":System.out.println("Chocolate"); 
                   break;
		case "p04":System.out.println("coco cola"); 
		           break;
		default :System.out.println("Invalid Input");           
		}
		return Num;
	}

}
