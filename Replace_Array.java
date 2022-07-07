// Q3. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34]?

class Replace_Array
{
	public static void main(String[] args)
	{
		int[] a={26,0,67,45,0,78,54,34,10,0,34};
		int i,j;
	
		System.out.println("Inputted elements in array");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	
		System.out.println("Numbers change 0's with 1's :");
	
		for(i=0;i<10;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			System.out.println(a[i]);
		}
	}
}
/*
Output :

Inputted elements in array
26
0
67
45
0
78
54
34
10
0
Numbers change 0's with 1's :
26
1
67
45
1
78
54
34
10
1
*/