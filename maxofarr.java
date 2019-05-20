import java.io.*;
import java.util.*;

public class maxofarr
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,l,i;
	n=get.nextInt();
	int[] arr =new int[n];
	for(i=0;i<n;i++)
	{
	arr[i]=get.nextInt();
	}
	l=arr[0];
	for(i=0;i<n;i++)
		{
		if(l<arr[i])
			{
			l=arr[i];
			}
		}
	System.out.print(l);

	}

}
