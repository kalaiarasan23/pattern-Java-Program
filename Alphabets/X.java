package alphabets;

class X
{
    public static void main(String[] args) 
	{
        n=7;
        X x = new X();
        x.patternX(n);
    }


	private void patternX(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==j||j==m-i+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
