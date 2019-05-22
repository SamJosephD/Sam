import java.io.*;
import java.util.*;

public class nofnum
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int l,i,count=0;
	String s;
	s=get.nextLine();
	l=s.length();
	char[] ch=s.toCharArray();
	for(i=0;i<l;i++)
	{
	
	
	if(ch[i]=='0' || ch[i]=='2' ||ch[i]=='3' ||ch[i]=='1' ||ch[i]=='4' ||ch[i]=='5' ||ch[i]=='6' ||ch[i]=='7' ||ch[i]=='8' ||ch[i]=='9')
		{
		
		count++;
		}
	
	
	}
	System.out.print(count);
	
	}
	

	

}
