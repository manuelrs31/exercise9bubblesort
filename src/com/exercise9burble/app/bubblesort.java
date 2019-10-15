package com.exercise9burble.app;

import java.util.Random;

public class bubblesort {

	public static void main(String[] args)
	{
		// constan declaration
		final int elements_array = 100;
		
		
		int temp =0;
		
		
		int[] disorderedarray = new int[100];
		int[] orderedarray = new int[elements_array];
		
		Random randomnumbers = new Random(System.nanoTime());
		
		for ( int i=0; i<elements_array; i++)
		{
			disorderedarray[i] = randomnumbers.nextInt(101);
			
		}
		
		for (int i=0; i<elements_array; i++)
		{
			
			System.out.print(disorderedarray[i]+" ");
		}
		
		for (int i=0; i<elements_array; i++)
		{
		for(int j=0;j<elements_array-1; j++)
		{
			if (disorderedarray[j]>disorderedarray[j+1])
			{
				temp=disorderedarray[j+1];
				disorderedarray[j+1]=disorderedarray[j];
				disorderedarray[j]=temp;
			}
		}
		}
		
		System.out.println(" ");
		for (int i=0; i<elements_array; i++)
		{
			System.out.print (disorderedarray[i]+" ");
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
