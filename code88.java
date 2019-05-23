import java.io.*;
import java.util.*;

public class code88
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int i,n,m,max=0,a,b;
	n=get.nextInt();
	m=get.nextInt();
	a=n;
	b=m;
	while(m!=n)
	{
		if(m>n)
		{
		n=n+a;
		}
		if(n>m)
		{
		m=m+b;
		}
	
	}
	System.out.print(m);

	}

}
