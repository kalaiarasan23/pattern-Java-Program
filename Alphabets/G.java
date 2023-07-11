package alphabets;

class G
{
    public static void main(String[] args) 
	{
        n=7;
        G g = new G();
        g.patternG(n);
    }

    private void PatternG(int m) 
    {
		int mid =m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||j==m&&i>=mid||j>=mid&&i==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
