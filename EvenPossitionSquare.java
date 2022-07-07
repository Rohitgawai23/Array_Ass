//Q8.Wap enter an array and print the square of the element which is on Even position.

import java.util.*;
class EvenPossitionSquare
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
			if(i%2==1)
			{
			    System.out.println("Element at Even position are : ");
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

Element at Even position are :
2
Square of element is : 4
*/

Element at Even position are :
4
Square of element is : 16