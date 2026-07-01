package com.java.ArrayList;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] arr)
	{
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[index]=arr[i];
				index++;
			}
			
		}
		arr[index]=arr[arr.length-1];
		return index+1;
		
	}
	public static void main(String[] args)
	{
		int arr[]= {1,1,2,3,4,4,5};
		int size=removeDuplicates(arr);
		System.out.println("New Length: "+size);
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
