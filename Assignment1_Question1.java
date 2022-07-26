package in.ineuron.main;

public class Assignment1_Question1 {
	
	public static void main(String args[])
	{
		
		//WAP (Assignment 1:Question 1): Write a program(WAP) to print INEURON using pattern programming logic.
		
		int n=5,i,j; // Declaring a variable of integer type to set the upper limit of pattern.
		
		//i refers to row and j refers to column
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||j==n/2||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(j=0;j<n;j++)
        	{
        		if(j==0||j==n-1||i==j)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			System.out.print("  ");
			
			for(j=0;j<n;j++)
        	{
        		if(i==0||j==0||i==n/2||i==n-1)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			
			System.out.print("  ");
			
			for(j=0;j<n;j++)
        	{
        		if(j==0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=n-1)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			
			System.out.print("  ");
			
			for(j=0;j<n;j++)
        	{
        		if(j==0||i==0&&j!=n-1||j==n-1&&i<=n/2||i==n/2||i==j&&i>=n/2)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			
			System.out.print(" ");
			
			for(j=0;j<n;j++)
        	{
        		if(i==0&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=0&i!=n-1)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			System.out.print("  ");
			
			for(j=0;j<n;j++)
        	{
        		if(j==0||j==n-1||i==j)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
			
			System.out.println();
			
		}
	
	}
	
	}
	
	



