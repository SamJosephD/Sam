import java.io.*;
import java.util.*;

public class count
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	long count=0;
	long a=get.nextLong();
	while(a!=0)
	{
	a=a/10;
	count++;	
	}
	System.out.print(count);
	}

}
