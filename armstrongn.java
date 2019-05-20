import java.io.*;
import java.util.*;

public class armstrongn
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);	
	long n,q,i,a;
	n=get.nextLong();
	q=get.nextLong();

	for(i=n+1;i<q;i++)
		{
		long temp=i,k=0;
		while(temp>0)
			{
			a=temp%10;
			k=k+(a*a*a);
			temp=temp/10;
			}
		if(k==i)
		{
		System.out.print(k+" ");
		}
		}
	}

}
