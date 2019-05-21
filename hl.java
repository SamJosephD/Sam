import java.io.*;
import java.util.*;

public class hl
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int i,n,h,l,temp;
	n=get.nextInt();
	int[] a= new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	}
	l=a[0];
	for(i=0;i<n;i++)
	{
		if(l>a[i])
		{
		temp=l;
		l=a[i];
		a[i]=temp;

		}
	}
	System.out.print(l+" ");
	h=a[0];
	for(i=0;i<n;i++)
	{
		if(h<a[i])
		{
		temp=h;
		h=a[i];
		a[i]=temp;
		}
	}
	System.out.print(h);
	
	}

}
