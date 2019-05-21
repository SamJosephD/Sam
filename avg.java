import java.io.*;
import java.util.*;

public class avg
{
public static void main(String[] args)
	{

	Scanner get=new Scanner(System.in);
	int n=get.nextInt(),i,sum=0,ans;
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
	sum=sum+a[i];
	
	}
	
	ans=sum/n;

	System.out.print(ans);

	}

}
