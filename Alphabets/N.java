package alphabets;

class N
{
    public static void main(String[] args) 
	{
        n1=7;
        N n = new N();
        n.patternN(n1);
    }

	private void patternN(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
	    }
    }
}
