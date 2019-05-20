import java.io.*;
import java.util.*;

public class sort
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n=get.nextInt(),i,j,temp;
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

	for(i=0;i<n;i++)
	{
	System.out.print(a[i]+ " ");
	}
	
	}

}
