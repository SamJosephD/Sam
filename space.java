import java.io.*;
import java.util.*;

public class space
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s="";
	s=get.nextLine();
	int l=s.length(),count=0,i;
	char[] ch=s.toCharArray();
	for(i=0;i<l;i++)
	{
	
		if(ch[i]==' ')
		{
		count++;
		}
	}
	l=l-count;
	System.out.print(l);
	}

}
