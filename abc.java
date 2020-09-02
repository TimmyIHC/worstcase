import java.io.*;
import java.util.*;
import java.lang.*;

//my first edit
class abc
{
	public static void main(String args[])
	{
		int i,d,g=0,nc=1,e,j,f,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of ranges");
		int n=sc.nextInt();
		int c[]=new int[n*2];
		for(i=0;i<(n*2);i=i+2)
		{
			System.out.println("Enter The range of "+nc);
			c[i]=sc.nextInt();
			c[i+1]=sc.nextInt();
			nc=nc+1;
		}
		int b[][]=new int[n][5];
		nc=0;
		for(i=0;i<(n*2);i=i+2)
		{
			b[nc][g]=c[i];g=g+1;
			b[nc][g]=c[i]+1;g=g+1;
			b[nc][g]=(c[i]+c[i+1])/2;g=g+1;
			b[nc][g]=c[i+1]-1;g=g+1;
			b[nc][g]=c[i+1];
			g=0;
			nc=nc+1;
		}	
		for(i=0;i<n;i++)
		{
			for(d=0;d<5;d++)
			System.out.print(b[i][d]+" ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
		e=0;
		double y=Math.pow(5,n);
		int x=(int)y;
		System.out.println("Number of test cases : "+x);
		System.out.println();
		System.out.println();
		System.out.println();
		int a[][]=new int[n][x];
		for(i=n-1;i>=0;i--)
		{
			f=0;
			for(d=0;d<5;d++)
			{
				j=0;
				double q=Math.pow(5,i);
				while(j!=(q))
				{
					a[e][f]=b[e][d];
					j=j+1;
					f=f+1;
				}
			}
			e=e+1;
		}
		for(i=0;i<x;i++)
		{
			p=p+1;
			System.out.print(p+":  "); 
			for(d=0;d<n;d++)
			{
				System.out.print(a[d][i]+" ");
			}
			System.out.println();
		}
	}

}
