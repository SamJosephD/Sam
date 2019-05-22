import java.io.*;
import java.util.*;

public class nofsent
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int l,i,count=1;
	String s;
	s=get.nextLine();
	l=s.length();
	char[] ch=s.toCharArray();
	for(i=0;i<l;i++)
	{
	if(ch[i]=='.')
		{
		count++;
		}
	}
	System.out.print(count);
	
	}
	

	

}
