package in.ineuron.main;

public class Assignment1_Question5 {

	public static void main(String[] args) {
		
		int n=11,i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||i+j<=n/2||i-j>=n/2)
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
