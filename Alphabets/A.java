package alphabets;

class A
{
    public static void main(String[] args) 
	{
        n=7;
        A a = new A();
        a.patternSimpleA(n);
        a.patternA(n);
    }
	
	private void patternSimpleA(int m)
	{
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||j==m||i==mid) 
					if(i==1&&(j==1||j==m))
						System.out.print("  ");
					else
						System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

    private void patternA(int m)
    {
		int t1,temp,temp1;
		t1=temp=temp1=m/2+1;
		temp1++;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i<t1) { 	//this condition for upper triangle
					
				if(j==temp)
				{
					System.out.print("* ");
					temp-- ;			
				}
								
				else if(j==temp1&& i!=1 )
				{
					System.out.print("* ");
					temp1++;
					break;
				}
				else
					System.out.print("  ");
			}
			else	
			{	
			
				if(i==t1||(i>t1&&(j==1||j==m))) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			}
			System.out.println();
		}
	}
}
