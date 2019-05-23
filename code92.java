import java.io.*;
import java.util.*;

public class code92
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,i,sum=0;
	n=get.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
	 sum=sum+a[i];
	}
	
	System.out.print(sum);
	}

}
