import java.io.*;
import java.util.*;

public class powof2
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,sum=1;
	n=get.nextInt();
	while (sum<n)
	{
	sum=sum*2;
	
	}
	
	if(sum==n)
	
	{
	System.out.print("yes");
	
	}
	else
	{
	System.out.print("no");
	}
	
	}

}
