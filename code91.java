import java.io.*;
import java.util.*;

public class code91
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int a,b,c,sur,vol;
	a=get.nextInt();
	b=get.nextInt();
	c=get.nextInt();
	sur=2*(a*b+a*c+b*c);
	vol=a*b*c;
	System.out.print(sur+" "+vol);
	
	}

}
