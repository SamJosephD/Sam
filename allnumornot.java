import java.io.*;
import java.util.*;

public class allnumornot
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	int i,count=0,n;
	char[] ch=s.toCharArray();
	n=s.length();
	for(i=0;i<n;i++)
	{
	
		if(ch[i]>='0' && ch[i]<='9' || ch[i]=='.')
		{
		count++;
		}
		
	}
	if(n==count)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}

	}

}
