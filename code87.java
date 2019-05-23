import java.io.*;
import java.util.*;

public class code87
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int i,n,m,max=0;
	n=get.nextInt();
	m=get.nextInt();
	if(m>n)
	{
		max=m;
	}
	else if(n>m)
	{
		max=n;
	}
	for(i=max;i>0;i--)
	{
	if(m%i==0 && n%i==0)
		{
		System.out.print(i);
		break;
		}
	
	}
	
	
	

	}

}
