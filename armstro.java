import java.io.*;
import java.util.*;

public class armstro
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,a,temp,k=0;
	n=get.nextInt();
	temp=n;
	while(temp>0)
	{
	a=temp%10;
	k=k+(a*a*a);
	temp=temp/10;
	}
	if(k==n)
	{
	System.out.print("yes");	
	}
	else
	{
	System.out.print("no");	
	}
	
	}

}
