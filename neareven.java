import java.io.*;
import java.util.*;

public class neareven
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n;
	n=get.nextInt();
	if(n%2==0)

	{
	System.out.print(n);
	
	}
	else if(n%2==1)
	{
	n=n-1;
	System.out.print(n);
	}
		
	}

}
