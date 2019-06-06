import java.io.*;
import java.util.*;
public class Stringcheck
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int l=a.length();
	int b=input.nextInt();
	b=l-b;
    String str="";
    for(int i=b;i<l;i++)
    {
        str=str+a.charAt(i);
    }
    System.out.println(str);
  }
}
