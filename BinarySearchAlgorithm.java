package in.ineuron.main;

import java.util.Scanner;

public class BinarySearchAlgorithm {
	
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		int index=-1;
		
		
		
		//Initializing the value in array.
		System.out.println("Enter the value in array :");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
			
		}
		
		
		
		//Sorting the array in ascending order
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) 
				{
					int storefirstElement=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=storefirstElement;
				
				}
			}
		}
		
		System.out.println("Displaying Sorted element in ascending order :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//Perform search 
		
		int low=0;
		int high=arr.length-1;
		
		System.out.println("Enter the element to search :");
		int key=obj.nextInt();
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				index=mid;
				break;
			}
			else if(key>arr[mid]) 
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("Element found in index :");
		
		System.out.println(index);
		
	
	}

}
