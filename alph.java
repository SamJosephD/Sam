import java.io.*;
import java.util.*;

public class alph
{
public static void main(String[] args)
	{
	Scanner get=new Scanner(System.in);
	char s;
	s=get.next().charAt(0);
	if((s>='a' && s<='z')||(s>='A' && s<='Z'))
		{
		System.out.print("Alphabet");
		}
	else
		{
		System.out.print("No");
		}
	}

}
