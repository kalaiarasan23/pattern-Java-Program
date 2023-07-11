package alphabets;

class F
{
    public static void main(String[] args) 
	{
        n=7;
        F f = new F();
        f.patternF(n);
    }

	private void patternF(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
