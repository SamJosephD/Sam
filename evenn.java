import java.io.*;
import java.util.*;

public class evenn
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long i,n,q;
	n=get.nextLong();
	q=get.nextLong();
	
	for(i=n+1;i<q;i++)
	{
	if(i%2==0)
		{
		System.out.print(i+" ");
		}
	}
	}

}
