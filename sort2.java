import java.io.*;
import java.util.*;

public class sort2
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int m=get.nextInt(),i,j,temp;
	int[] a =new int[m];
	for(i=0;i<m;i++)
	{
	a[i]=get.nextInt();
	}
	for(i=0;i<m;i++)
	{

		for(j=i+1;j<m;j++)
		{
		if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}

	}

	for(i=0;i<m;i++)
	{
	System.out.print(a[i]+ " ");
	}
	
	}

}
