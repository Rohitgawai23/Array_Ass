//Q6.Wap enter an array and find the duplicate element and also count of that.


import java.util.*;
class SearchingDuplicatenno_Array
{
	public static void main(String []args)
	{
		int i,j, n,c=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("enter element in array= ");
		
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("inputted element in array= ");
		for(i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("searching duplicate element in array=");
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
			   	System.out.println(a[j]);
			   	c++;
				}
			}
		}
	  	      System.out.println("number of duplicate element= "+c);
	}

}		
/*		
Output :
enter element in array=
1
2
2
3
3
4
inputted element in array=
1
2
2
3
3
4
searching duplicate element in array=
2
3
number of duplicate element= 2

*/


