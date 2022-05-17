class Pascal
{
	public static void main(String[] args) 
	{   
		int n =16;
		int c=1;

		for(int i=0; i<n; i++)
		{   
			for(int k=1; k<=n-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				if(i==0 || j==0)
				{
					c=1;
				}
				else
					c = c*(i-j+1)/j;

				System.out.print(" "+c);

			}
			System.out.println();
		}
	}
}
