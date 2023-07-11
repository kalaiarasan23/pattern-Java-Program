package alphabets;

class K
{
    public static void main(String[] args) 
	{
        n=7;
        K k = new K();
        k.patternK(n);
    }

	private void patternK(int m) 
    {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1 || i<mid && j==mid-i+2 || i>=mid && j==i-mid+2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
