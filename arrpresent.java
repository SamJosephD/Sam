import java.io.*;
import java.util.*;

public class arrpresent
{
public static void main(String[] args)
	{

	Scanner get=new Scanner(System.in);
	int n,k,i,count=0;
	n=get.nextInt();
	k=get.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	
	}
	
	for(i=0;i<n;i++)
	{
		if(k==a[i])
		{
		count++;
		}
	
	
	}
	
	if(count!=0)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	
	}
	
	

	}

}
