import java.io.*;
import java.util.*;

public class bitswap
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int a,b;
	a=get.nextInt();
	b=get.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.print(a+" "+b);	
	}

}
