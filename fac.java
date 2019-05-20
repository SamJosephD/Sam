import java.io.*;
import java.util.*;

public class fac
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long n,i,sum=1;
	n=get.nextLong();
	for(i=n;i>=1;i--)
		{
		sum=sum*i;
		}

	System.out.print(sum);
	}

}
