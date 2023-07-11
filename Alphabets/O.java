package alphabets;

class O
{
    public static void main(String[] args) 
	{
        n=7;
        O o = new O();
        o.patternO(n);
    }

    private void patternO(int m) 
    {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||j==m) {
					if(i==m&&j==m||i==1&&j==m||i==m&&j==1||i==1&&j==1)
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
