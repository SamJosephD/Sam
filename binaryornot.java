import java.io.*;
import java.util.*;

public class binaryornot
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	int count=0,i,l=s.length();
	char[] ch=s.toCharArray();
	for(i=0;i<l;i++)
	{
	 if(ch[i]=='0'|| ch[i]=='1')
		{
		count++;
	
		}
		
	}
	
	if(count==l)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	
	}

}
