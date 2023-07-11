package alphabets;

class L
{
    public static void main(String[] args) 
	{
        n=7;
        L l = new L();
        l.patternL(n);
    }

	private void patternL(int m) 
    {
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==m||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
