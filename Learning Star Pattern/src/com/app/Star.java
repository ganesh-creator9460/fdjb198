package com.app;

public class Star {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	// i= 1 1<=5 
					// j=1 1<=1	true
					// j=2 2<=1 false
					// *
	// i=2 2<=5
					// j=1 1<=2	true
					// j=2 2<=2	true
					// j=3 3<=2	false
					// **
}
}
