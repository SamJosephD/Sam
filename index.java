import java.io.*;
import java.util.*;

public class index
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n=get.nextInt(),i;
	int[] arr=new int[n];
	for(i=0;i<n;i++)
	{
	arr[i]=get.nextInt();
	}
	
	for(i=0;i<n;i++)
	{
	System.out.println(arr[i]+" "+ i);
	}

	}

}
