package alphabets;

class I
{
    public static void main(String[] args) 
	{
        n=7;
        J j = new J();
        j.patternJ(n);
    }

	private void patternJ(int m) 
    {
		int mid=m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==mid||i==m&&j<mid)
					if(i==m&&j==mid)
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
