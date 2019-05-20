import java.io.*;
import java.util.*;

public class vow
{
public static void main(String[] args)

	{
	char s;
	Scanner get =new Scanner(System.in);
	s=get.next().charAt(0);
	if(s=='a'|| s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U')
		{
		System.out.print("Vowel");
		}
	else if(s=='b'|| s=='B'||s=='c'||s=='C'||s=='d'||s=='D'||s=='f'||s=='F'||s=='G'||s=='g'|| s=='h'||s=='H'||s=='j'||s=='J'||s=='k'||s=='K'||s=='l'||s=='L'||s=='m'|| s=='M'||s=='n'||s=='N'||s=='p'||s=='P'||s=='Q'||s=='q'||s=='r'||s=='R'|| s=='s'||s=='S'||s=='t'||s=='T'||s=='v'||s=='V'||s=='w'||s=='W'||s=='x'|| s=='X'||s=='y'||s=='Y'||s=='z'||s=='Z')
		{
		System.out.print("Consonant");
		}
	else
		{
		System.out.print("invalid");
		}
		
	}

}
