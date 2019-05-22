import java.io.*;
import java.util.*;

public class special
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s;
	s=get.nextLine();
	int i,l,special=0;
	l=s.length();
	char[] a=s.toCharArray();
	for(i=0;i<l;i++)
	{
	if(a[i]>='a'&& a[i]<='z')
	{}
	else if(a[i]>='A'&& a[i]<='Z')
	{}
	else if(a[i]>='0'&& a[i]<='9')
	{}
	else if(a[i]==' ')
	{}
	else
	{
	special++;
	}

	


	}
	System.out.print(special);

	}

}
