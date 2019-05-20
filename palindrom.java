import java.io.*;
import java.util.*;

public class palindrom
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n=get.nextInt();
	int a,sum=0;
	int b=n;
	while(b>0)
	{
	a=b%10;
	
	sum=(sum*10)+a;
	
	b=b/10;
	}
	if(sum==n)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}

}
