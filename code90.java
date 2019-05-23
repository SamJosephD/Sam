import java.io.*;
import java.util.*;

public class code90
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	char[] a=s.toCharArray();
	int l=s.length(),i;
	for(i=0;i<l;i++)
	{
		if(a[i]>='0' && a[i]<='9')
		{
		System.out.print(a[i]);
		}
	}
	
	}

}
