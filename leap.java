import java.io.*;
import java.util.*;

public class leap
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	double a=get.nextDouble();
	double l=a%4;
	if(l==0)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("not");
	}

	}

}
