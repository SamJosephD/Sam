import java.io.*;
import java.util.*;

public class hrd
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	int h1,m1,h2,m2;
	h1=get.nextInt();
	m1=get.nextInt();
	h2=get.nextInt();
	m2=get.nextInt();
	if(h1>h2)
	{
	 if(m2>m1)
		{
		h1=h1-1;
		m1=m1+60;
		}
	h1=h1-h2;
	m1=m1-m2;
	System.out.print(h1+" "+m1);


	}
	
	else if(h1<h2)
	{
	 if(m2<m1)
		{
		h2=h2-1;
		m2=m2+60;
		}
	h1=h2-h1;
	m1=m2-m1;
	System.out.print(h1+" "+m1);


	}

	else if(h1==h2 && m1<m2)
	{
		
		
	
	h1=h2-h1;
	m1=m2-m1;
	System.out.print(h1+" "+m1);
	}
	else if(h1==h2 && m1>m2)
	{
		
		
	
	h1=h2-h1;
	m1=m1-m2;
	System.out.print(h1+" "+m1);
	}
	else if(h1==h2)
	{
		
		
	
	h1=h2-h1;
	m1=m2-m1;
	System.out.print(h1+" "+m1);
	
	}
	}

}
