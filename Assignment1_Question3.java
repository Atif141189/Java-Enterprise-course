package in.ineuron.main;

public class Assignment1_Question3 {

	public static void main(String[] args) {
		
		int n=15,i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1||i+j<=n/2||j-i>=n/2)
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
