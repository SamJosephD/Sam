import java.io.*;
import java.util.*;

public class median
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n=get.nextInt(),i,j,temp,b=n;
	int[] a =new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	}
	for(i=0;i<n;i++)
	{

		for(j=i+1;j<n;j++)
		{
		if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}

	}
	
	int m=b%2;

	if(m==0)
	{
	b=b/2-1;

	System.out.print(a[b]);
	}
	else if(m==1)
	{
	b=b/2;

	System.out.print(a[b]);
	}

	}

}
