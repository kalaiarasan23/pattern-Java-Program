package alphabets;

class I
{
    public static void main(String[] args) 
	{
        n=7;
        I i = new I();
        i.patternI(n);
    }
	private void patternI(int m) 
    {
		int mid=m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||i==m||j==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

