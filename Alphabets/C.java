package alphabets;

class C
{
    public static void main(String[] args) 
	{
        n=7;
        C c = new C();
        c.patternC(n);
    }
	private void patternC(int m) 
    {
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m)
					if((i==1 || i==m) &&j==1)
						System.out.print("  ");
					else	
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
