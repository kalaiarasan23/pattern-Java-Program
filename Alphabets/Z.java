package alphabets;

class Z
{
    public static void main(String[] args) 
	{
        n=7;
        Z z = new Z();
        z.patternZ(n);
    }

	private void patternZ(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==m-i+1||i==m)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
