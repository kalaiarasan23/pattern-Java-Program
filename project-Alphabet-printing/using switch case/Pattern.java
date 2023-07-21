package july4;

public class Pattern {

	public static void main(String[] args) 
	{
		Pattern p = new  Pattern();
		int n=11;						
		String s = "abcdefghijklmnopqrstuvwxyz";
	
		for(int i=0;i<s.length();i++) {
		switch(s.charAt(i))
		{
		case 'a','A':
			p.simpleA(n);
			//p.a(n);
			break;
		case 'b','B':
			p.b(n);
			break;
		case 'c','C':
			p.c(n);
			break;
		case 'd','D':
			p.d(n);
			break;
		case 'e','E':		
			p.e(n);
			break;
		case 'f','F':
			p.f(n);
			break;
		case 'g','G':
			p.g(n);
			break;
		case 'h','H':
			p.h(n);
			break;
		case 'i','I':
			p.i(n);
			break;
		case 'j','J':
			p.j(n);
			break;
		case 'k','K':
			p.k(n);
			break;
		case 'l','L':
			p.l(n);
			break;
		case 'm','M':
			p.m(n);
			break;
		case 'n','N':
			p.n(n);
			break;
		case 'o','O':
			p.o(n);
			break;
		case 'p','P':	
			p.p(n);
			break;
		case 'q','Q':
			p.q(n);
			break;
		case 'r','R':
			p.r(n);
			break;
		case 's','S':
			p.s(n);
			break;
		case 't','T':
			p.t(n);
			break;
		case 'u','U':
			p.u(n);
			break;
		case 'v','V':
			p.v(n);
			break;
		case 'w','W':
			p.w(n);
			break;
		case 'x','X':
			p.x(n);
			break;
		case 'y','Y':
			p.y(n);
			break;
		case 'z','Z':
			p.z(n);
			break;
		}
		System.out.println();
		System.out.println();
	}
	}
	private void k(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1 || i<mid && j==mid-i+2 || i>=mid && j==i-mid+2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void n(int m) {
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

	private void m(int m) {
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

	private void z(int m) {
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

	private void y(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==j && i<=m/2+1 ||j==m-i+1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void x(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==j||j==m-i+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void w(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1 ||j==m||(i==j ||j==m-i+1)&& i>=mid) 
						System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void v(int m) {
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

	private void u(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==m||j==1||i==m) 
					if((j==1||j==m)&&i==m)
						System.out.print("  ");
					else
						System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void t(int m) {
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

	private void s(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1 && i<mid||i==mid||j==m&& i>mid||i==m) 
				{
					if(j==1&&(i==1||i==mid)||j==m&&(i==mid || i==m)  )
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

	private void r(int m) {
		int mid,midd;
		mid=midd=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j==1||i==1||j==m && i<mid ||i==mid || i==j && i>mid)
					if((i==1||i==mid)&&j==m)
						System.out.print("  ");
					else
						System.out.print("* ");
				else
					System.out.print("  ");
								
			}
			System.out.println();
		}
	}

	private void q(int m) {
		int mid=m/2+1;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1 && j<m-1 ||j==1 && i<m-1||i==m-1 && j<m-1||j==m-1 && i<m-1||i==j&& i>=mid) {
					if(i==m&&j==m-1||i==1&&j==m-1||i==m-1&&j==1||i==1&&j==1)
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

	private void p(int m) {
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

	private void o(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||j==m) {
					if(i==m&&j==m||i==1&&j==m||i==m&&j==1||i==1&&j==1)
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

	private void l(int m) {
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==m||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void j(int m) {
		int mid=m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==mid||i==m&&j<mid)
					if(i==m&&j==mid)
						System.out.print("  ");
					else
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void i(int m) {
		int mid=m/2+1;
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||i==m||j==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void h(int m) {
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

	private void g(int m) {
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

	private void f(int m) {
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

	private void e(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||i==m/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void d(int m) {
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==2||i==m||j==m) {
					if(i==m&&j==m||i==1&&j==m)
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

	private void c(int m) {
		for(int i=1 ;i<=m ;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m)
					if((i==1 || i==m) &&j==1)
						System.out.print("  ");
					else	
						System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void a(int m) {
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
	
	private void simpleA(int m)
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

	private void b(int m) 
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==m||j==m||i==m/2+1) {
					if(i==m&&j==m||i==1&&j==m||i==m/2+1&&j==m)
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
