import java.util.*;
import java.io.*;
class tasks3
{
public static void main(String args[]) throws IOException
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int top=0;
	String a[]=new String[n];
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<n;i++)
	{
		a[i]=reader.readLine();
	}
	for(int i=0;i<n;i++)
	{System.out.println(a[i]);
	}
	String stack[]=new String[n];
	for(int i=0;i<n;i++){   if(a[i].length()==6)
				{char r=a[i].charAt(a[i].length()-1);
				if(i==0)	top=0;
				else top++;
				stack[top]=Character.toString(r);
				System.out.println(stack[top]);
				}
			else if(a[i].length()==3)
				{
				top--;
				if(top==-1)	System.out.println("EMPTY");
				else		System.out.println(stack[top]);
				}
			else
				{int k=Integer.parseInt(a[i].charAt(a[i].length()-1)+"");
				int e=Integer.parseInt(a[i].charAt(a[i].length()-3)+"");
				for(int j=0;j<e;j++){int m=new Integer(stack[j]);
				m+=k;
				stack[j]=Integer.toString(m);}
				System.out.println(stack[top]);
				break;}
		
	}
}}
