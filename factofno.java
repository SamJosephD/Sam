import java.io.*;
import java.util.*;

public class factofno
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,i;
	n=get.nextInt();
	for(i=1;i<=n;i++)
	{
	 if(n%i==0)
		{
		System.out.print(i+ " ");
		}
	}

	}

}
