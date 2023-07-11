package alphabets;

class R
{
    public static void main(String[] args) 
	{
        n=7;
        R r = new R();
        r.patternR(n);
    }

	private void patternR(int m) 
    {
		int mid,midd;
		mid=midd=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||i==1||j==m && i<mid ||i==mid || i==j && i>mid)
					if((i==1||i==mid)&&j==m)
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
