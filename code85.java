import java.io.*;
import java.util.*;

public class code85
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	char[] ch=s.toCharArray();
	int l=s.length(),i;
	for(i=0;i<l;i++)
	{
	 if(i%2==0)
		{
		System.out.print(ch[i]);
		}
	}
	System.out.print(" ");
	
	for(i=0;i<l;i++)
	{
	 if(i%2==1)
		{
		System.out.print(ch[i]);
		}
	}

	}

}
