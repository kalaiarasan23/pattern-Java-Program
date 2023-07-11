package alphabets;

class T
{
    public static void main(String[] args) 
	{
        n=7;
        T t = new T();
        t.patternT(n);
    }
	
    private void patternT(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==mid) 
					System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
