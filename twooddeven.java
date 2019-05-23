import java.io.*;
import java.util.*;
public class twooddeven
{
	public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int a=get.nextInt();
	int b=get.nextInt();
	int c=a+b;
	int j=c%2;
	if(j==0)
		{
		System.out.print("even");
		}
	else if(j==1)
		{
		System.out.print("odd");
		}

	else

		{
		System.out.print("not valid");
		}
	}


}
