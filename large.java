import java.io.*;
import java.util.*;

public class large
{
public static void main(String[] args)
	{
	
	Scanner get=new Scanner(System.in);
	long a,b,c;
	a=get.nextLong();
	b=get.nextLong();
	c=get.nextLong();
	if(a>=c && a>=b)
		{
		System.out.print(a);
		}
	else if(b>=a && b>=c)
		{
		System.out.print(b);
		}
	else if(c>=a && c>=b)
		{
		System.out.print(c);
		}
	}
	


}
