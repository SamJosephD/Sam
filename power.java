import java.io.*;
import java.util.*;

public class power
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long n,k,i,sum=1;
	n=get.nextLong();
	k=get.nextLong();
	for(i=0;i<k;i++)
	{
	sum=sum*n;
	}
	System.out.print(sum);
	}

}
