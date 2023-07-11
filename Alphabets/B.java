package alphabets;

class B
{
    public static void main(String[] args) 
	{
        n=7;
        B b = new B();
        b.patternB(n);
    }

	private void patternB(int m) 
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||j==m||i==m/2+1) {
					if(i==m&&j==m||i==1&&j==m||i==m/2+1&&j==m)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

    
}
