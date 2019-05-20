import java.io.*;
import java.util.*;

public class nki
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,k,i;
	n=get.nextInt();
	k=get.nextInt();
	int size=n;
	int[] arr=new int[n];
	int sum=0;
	for(i=0;i<n;i++)
		{
		arr[i]=get.nextInt();
		}
	for(i=0;i<k;i++)
		{
		sum=sum+arr[i];
		}
	
	System.out.print(sum);
	}

}
