package alphabets;

class Q
{
    public static void main(String[] args) 
	{
        n=7;
        Q q = new Q();
        q.patternQ(n);
    }

	private void patternQ(int m) 
    {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1 && j<m-1 ||j==1 && i<m-1||i==m-1 && j<m-1||j==m-1 && i<m-1||i==j&& i>=mid) {
					if(i==m&&j==m-1||i==1&&j==m-1||i==m-1&&j==1||i==1&&j==1)
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
