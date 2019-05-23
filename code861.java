import java.io.*;
import java.util.*;

public class code861
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	String s=get.nextLine();
	char[] ch=s.toCharArray();
	int l=s.length(),i,j,count=0;
	for(i=0;i<l;i++)
		{
		for(j=0;j<l;j++)
			if(ch[i]==ch[j])
			{
			count++;
			}
	
	
		}
	
	if(count==l)
	{
	System.out.print("Yes");
	}
	else
	System.out.print("No");
	
	}

}
