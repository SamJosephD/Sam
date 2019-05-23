import java.io.*;
import java.util.*;

public class code94
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int i,m,n;
	n=get.nextInt();
	m=get.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=get.nextInt();
	}
	int sub=m-1;
	System.out.print(a[sub]);
	
	}

}
