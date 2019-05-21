import java.io.*;
import java.util.*;

public class sumofall
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,a,sum=0;
	n=get.nextInt();
	while(n>0)
	{
	a=n%10;
	sum=sum+a;
	n=n/10;
	
	}
	System.out.print(sum);
	}

}
