package alphabets;

class P
{
    public static void main(String[] args) 
	{
        n=7;
        P p = new P();
        p.patternP(n);
    }

	private void patternP(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||j==m && i<mid ||i==mid) {
					if((i==mid || i==1) && j==m)
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
