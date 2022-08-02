package in.ineuron.main;

import java.util.Scanner;

public class SortingAlogorithm {

	public static void main(String[] args) {
		
		//WAP:Sorting array in ascending order
		
		Scanner obj=new Scanner(System.in);
		
		int storefirstElementtemp;
		
		int []arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=obj.nextInt();
		
		}
		
		//Thinking process/Logic is applied
		//Step 1:Checking first element is greater than second element
		//Step 2:if Step1 condition is true,then we need to swap the element as we are sorting the elements in ascending order
		//Step 3:To swap 2 element we have to follow a process.
		      //Process
	          //1. store the first element in temporary variable.
	          //2. assign/swap the value of second in first. i.e first element will store the value of second.
              //3. assign the value of first element stored in temporary variable to second variable.
		//Step 4: Compare the first element again with remaining value in the array.
		
		//[10,9,8,6,7]
		//[9,10,8,6,7]
		//[8,10,9,6,7]
		//[6,10,9,8,7]
		//[6,9,10,8,7]
		//[6,8,10,9,7]
		//[6,7,10,9,8]
		//[6,7,9,10,8]
		//[6,7,8,10,9]
		//[6,7,8,9,10]
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) 
				{
					storefirstElementtemp=arr[i];
					
					arr[i]=arr[j];//assigning the value of second to first
					
					arr[j]=storefirstElementtemp; //assigning the value of first element to second
				}
			}
		
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		
		}
		
		
	

	}

}
