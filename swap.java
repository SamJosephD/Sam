import java.io.*;
import java.util.*;

public class swap
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int a,b,temp;
	a=get.nextInt();
	b=get.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.print(a+" "+b);
	}

}
