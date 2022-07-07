//Q11.Wap enter an array and print it in reverse order.

import java.util.*;
class Reverse_Array
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		int i;
		int [] a = new int[5];

		System.out.println(" Enter elements : ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println(" Reverse elements are: ");
		for(i=4; i>=0; i--)
		{
			System.out.println(a[i]);	
		}
	
	}
}

Output :

 Enter elements :
1
2
3
4
5
 Reverse elements are:
5
4
3
2
1