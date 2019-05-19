import java.io.*;
import java.util.*;
public class oddoreven
{
	public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int s=get.nextInt();
	int j=s%2;
	if(j==0)
		{
		System.out.print("Even");
		}
	else if(j==1)
		{
		System.out.print("Odd");
		}

	else

		{
		System.out.print("not valid");
		}
	}


}
