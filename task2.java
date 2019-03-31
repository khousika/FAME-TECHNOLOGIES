import java.util.*;
import java.util.Iterator;

class task2
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int count=0;int f=0;
	List<Integer> res=new ArrayList<>();
	ListIterator<Integer> resi=res.listIterator();
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int k=s.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;(j<n);j++)
		{if(j==i)
		continue;
		//System.out.println(a[i]+","+a[j]);
		if(a[i]+a[j]==k)
			{
			resi=res.listIterator();
			while(resi.hasNext())
			{if(((Integer)resi.next()).intValue()==a[i])
			f=1;}//System.out.println(f);
			if(f==0){
			res.add(a[i]);
			res.add(a[j]);System.out.println("("+a[i]+","+a[j]+")");}f=0;
			}
		}
	}
count=res.size()/2;
System.out.println(count);
}}