package alphabets;

class S
{
    public static void main(String[] args) 
	{
        n=7;
        S s = new S();
        s.patternS(n);
    }

	private void patternS(int m) 
    {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1 && i<mid||i==mid||j==m&& i>mid||i==m) 
				{
					if(j==1 && (i==1||i==mid)|| j==m && (i==mid||i==m)  )
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

