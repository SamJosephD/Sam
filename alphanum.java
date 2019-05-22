import java.io.*;
import java.util.*;

public class alphanum
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int low=0,high=0,num=0;
	String s;
	s=get.nextLine();
	int i,l,special=0;
	l=s.length();
	char[] a=s.toCharArray();
	for(i=0;i<l;i++)
	{
	if(a[i]>='a'&& a[i]<='z')
	{
	low++;
	}
	else if(a[i]>='A'&& a[i]<='Z')
	{
	high++;
	}
	else if(a[i]>='0'&& a[i]<='9')
	{
	num++;
	}
	else if(a[i]==' ')
	{}
	else
	{
	special++;
	}

	}
	if(low!=0 || high!=0 && num!=0)
	{
	System.out.print("Yes");
	}
	else
	{
	System.out.print("No");
	}
	
	}

}
