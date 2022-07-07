//Q1.Wap en ter an array and find the sum and count of element present at even position

import java.util.*;
class ArrayEvenPositioncount
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

		System.out.println(" Number at even position are : ");

		for(i=0; i<5; i++)
		{
			if(i%2==1)
			{
			  System.out.println(a[i]);	
			   s=s+a[i];
			   c++;
			}
		}
	
		System.out.println(" Count of even number is : " +c);
		System.out.println(" sum of even number is : " +s);
	}
}

/*
Output :

 Enter elements :
1
2
3
4
5
 Number at even position are :
2
4
 Count of even number is : 2
 sum of even number is : 6
*/