import java.io.*;
import java.util.*;

public class prime
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long n=get.nextLong(),i;
	boolean f= false;
	for(i=2;i<=n/2;i++)
	{
	if(n%i==0)
		{
		f = true;
		break;
		}
	} 
	if(!f)
		{
		System.out.print("yes");
		}
	else
		
		{
		System.out.print("no");
		}
	}

}
