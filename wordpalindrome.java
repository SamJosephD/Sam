import java.io.*;
import java.util.*;

public class wordpalindrome
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	String a="";
	int i,l=s.length();
	char[] ch=s.toCharArray();
	for(i=l-1;i>=0;i--)
	{
	a=a+ch[i];
	
	}
	
	if(s.equals(a))
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	
	

	}

}
