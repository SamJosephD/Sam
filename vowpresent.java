import java.io.*;
import java.util.*;

public class vowpresent
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	char[] ch=s.toCharArray();
	int l=s.length(),count=0;
	for(int i=0;i<l;i++)
	{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
		{
		count++;
		}
	
	}
	if(count!=0)
	{
	System.out.print("yes");
	
	}
	else
	{
	System.out.print("no");
	}

	}

}
