package alphabets;

class V
{
    public static void main(String[] args) 
	{
        n=7;
        V v = new V();
        v.patternV(n);
    }

    private void patternV(int m) 
    {
		int t=1,max=m;
		for(int i = 1; i<=m;i++)
	    {
	        for(int j = 1; j<=m; j++)
	        {
	        	if(i%2==1)
	        	{
	        		if(j==t)
	        		{
	        			System.out.print("* ");
	        		}
	        		else if(j==max)
	        		{
	        			System.out.print("*");
	        			max--;
	        		}
	        		else
	        		{
	        			System.out.print("  ");
	        		}
	        	}
	        	else
	        		System.out.print("  ");
	        }
	        System.out.println(); 
	        if(i%2==1)
	        	t++;
	    } 
	}
}
