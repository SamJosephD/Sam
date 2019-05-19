import java.io.*;
import java.util.*;

public class pnz
{
	public static void main(String[] args)

	{
		Scanner get=new Scanner(System.in);
		double a=get.nextDouble();
		if(a>0)
			{
			System.out.print("Positive");
			}
		else if(a<0)
			{
			System.out.print("Negative");
			}
		else if(a==0)
			{
			System.out.print("Zero");
			}
		else	
			{
			System.out.print("Invalid Element");
			}
	}

}
