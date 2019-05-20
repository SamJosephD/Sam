import java.io.*;
import java.util.*;

public class arithmeti
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long n,a,d,temp,sum=0,i;
	n=get.nextLong();
	a=get.nextLong();
	d=get.nextLong();
	for(i=0;i<n;i++)
	{
	temp=a+(i*d);
	sum=sum+temp;
	
	}
	System.out.print(sum);

	}

}
