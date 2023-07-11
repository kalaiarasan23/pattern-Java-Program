package alphabets;

class D
{
    public static void main(String[] args) 
	{
        n=7;
        D d = new D();
        d.patternD(n);
    }
	private void patternD(int m) 
    {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==2||i==m||j==m) {
					if(i==m&&j==m||i==1&&j==m)
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
