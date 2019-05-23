import java.io.*;
import java.util.*;

public class notorprime
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,i,count=0;
	n=get.nextInt();
	
	for(i=n;i>0;i--)
	{
	 if(n%i==0)
		{
		count++;
		}
	}
	if(count==2)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}

	}

}
