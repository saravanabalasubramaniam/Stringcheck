import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int b=input.nextInt();
	for(int i=b;i<a.length();i++)
	{
		char c=a.charAt(i);
		System.out.print(c);
	}
  }
}
