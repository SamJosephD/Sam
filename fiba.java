import java.io.*;
import java.util.*;

public class fiba
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,temp,a=1,b=1,i=1;
	n=get.nextInt();
	while(i<=n)
	{
	System.out.print(a+ " ");
	temp=a+b;
	a=b;
	b=temp;
	i++;
	
	}
		
	}

}
