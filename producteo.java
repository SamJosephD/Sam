import java.io.*;
import java.util.*;

public class producteo
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n,m,p,q;
	n=get.nextInt();
	m=get.nextInt();
	p=m*n;
	q=p%2;
	if(q==0)
	{
	System.out.print("even");
	}
	else if(q==1)
	{
	System.out.print("odd");
	}
	

	}

}
