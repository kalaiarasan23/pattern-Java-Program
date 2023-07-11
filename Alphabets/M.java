package alphabets;

class M
{
    public static void main(String[] args) 
	{
        n=7;
        M m = new M();
        m.patternM(n);
    }

    	private void patternM(int m) 
        {
		int mid=m/2+1;
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||(i==j || j==m-i+1)&& i<=mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
