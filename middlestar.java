import java.io.*;
import java.util.*;

public class middlestar
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	
	char[] ch=s.toCharArray();
	int m,n,l=s.length(),i;
	m=l%2;
	n=l/2;
	if(m==0)
	{
	ch[n]='*';
	ch[n-1]='*';
	}
	else if(m==1)
	{
	ch[n]='*';
	}
	for(i=0;i<l;i++)
	{
	System.out.print(ch[i]);
	}
	
	}

}
