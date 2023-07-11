package alphabets;

class U
{
    public static void main(String[] args) 
	{
        n=7;
        U u = new U();
        u.patternU(n);
    }

	private void patternU(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==m||j==1||i==m) 
					if((j==1||j==m)&&i==m)
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
