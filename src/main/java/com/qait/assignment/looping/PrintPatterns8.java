package com.qait.assignment.looping;

public class PrintPatterns8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=8;
		
		for(int i =0;i<n;i++)
		{
			int k=1;
			for(int j =0 ;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("\n");
		}
		
		
	}

}
