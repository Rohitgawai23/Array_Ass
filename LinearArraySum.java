/*
Output :

a =  1 2 3 4 5 6
b =  5 6 6 4 3 2
------------------
c =  6 8 9 8 8 8

*/




class LinearArraySum
{
	public static void main(String[] args)
	{
		int i;

		int [] a ={1,2,3,4,5,6};
		int [] b ={5,6,6,4,3,2};
		
		System.out.print("a = ");
		for(i=0; i<6; i++)
		{
			System.out.print(" "+a[i]);
			
		}

		System.out.println();
		System.out.print("b = ");
		for(i=0; i<6; i++)
		{
			System.out.print(" "+b[i]);
			
		}

		System.out.println();
		System.out.println("------------------");
		System.out.print("c = ");
		for(i=0; i<6; i++)
		{
			int c = a[i]+b[i];
			System.out.print(" "+c);
		}
	}
}	

