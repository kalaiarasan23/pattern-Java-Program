package alphabets;

class H
{
    public static void main(String[] args) 
	{
        n=7;
        H h = new H();
        h.patternH(n);
    }

 	private void patternH(int m) 
    {
		int mid=m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||j==m||i==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}   
}
