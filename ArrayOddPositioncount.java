// Q2.Wap enter an array and find the sum and count of  odd element .


import java.util.*;
class ArrayOddPositioncount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int i,s=0,c=0;
		int [] a = new int[5];

		System.out.println(" Enter elements : ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		
		for(i=0; i<5; i++)
		{
			if(a[i]%2==0)
			{	
			   s=s+a[i];
			   c++;
			}
		}
	
		System.out.println(" Count of odd number is : " +c);
		System.out.println(" sum of odd number is : " +s);
	}
}
/*
Output: 

 Enter elements :
1
2
3
4
5
 Number at even position are :
1
3
5
 Count of odd number is : 3
 sum of odd number is : 9
*/