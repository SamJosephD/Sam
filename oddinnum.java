import java.io.*;
import java.util.*;

public class oddinnum
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,a,n1=0,a2;
	n=get.nextInt();
	while(n>0)
	{
	a=n%10;
	n=n/10;
	n1=n1*10+a;
	}
	
	while(n1>0)
	{
	a2=n1%10;
	n1=n1/10;
	if(a2%2==1)
	{
	System.out.print(a2);
	}
	
	}
	

	}

}
