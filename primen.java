import java.io.*;
import java.util.*;

public class primen
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long n,q,i,j,count;
	n=get.nextLong();
	q=get.nextLong();
	String prime = "";

	for(i=n;i<q;i++)
	{
	count=0;
		for(j=i;j>=1;j--)
		{
		if(i%j==0)
			{
			count++;
			}

		
		}
		if(count==2)
			{
			prime = prime + i +" ";
			}

	}
	System.out.print(prime);	
	}

}
