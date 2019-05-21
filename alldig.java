import java.io.*;
import java.util.*;

public class alldig
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,rev=0,a,b;
	n=get.nextInt();
	while(n>0)
	{
	a=n%10;
	n=n/10;
	rev=rev*10+a;
	}
	
	int m=rev;
	while(m>0)
	{
	b=m%10;
	m=m/10;
	System.out.print(b+" ");
	}


	}

}
