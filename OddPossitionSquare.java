//Q7.Wap enter an array and print the square of the element which is on odd position.

import java.util.*;
class OddPossitionSquare
{
	public static void main(String []args)
	{
		int i,s=0;
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		System.out.println("Enter element :");
		
		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0; i<5; i++)
		{
			if(i%2==0)
			{
			    System.out.print("Element at odd position are : ");
			    System.out.println(a[i]);
			    s=a[i]*a[i];
			    System.out.println("Square of element is : "+s);
				
			}
			System.out.println();

		}
		
	}
}
/*
Output :

Enter element :
1
2
3
4
5
Element at odd position are : 1
Square of element is : 1


Element at odd position are : 3
Square of element is : 9


Element at odd position are : 5
Square of element is : 25
*/