import java.io.*;
import java.util.*;

public class composite
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,i,count=0;
	n=get.nextInt();
	for(i=n;i>1;i--)
	{
	if(n%i==0)
		{
		count++;
		}
	
	}
	if(count!=1)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}

	}

}
