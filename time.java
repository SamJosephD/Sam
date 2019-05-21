import java.io.*;
import java.util.*;

public class time
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int n=get.nextInt(),h,m;
	m=n%60;
	h=n/60;
	System.out.print(h+" "+m);
	}

}
