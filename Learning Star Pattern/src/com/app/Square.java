package com.app;

public class Square {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	i=1 1<=4 true
//					j=1 j<=4 true
//					j=2 j<=4 true
//					j=3 j<=4 true
//					j=4 j<=4 true
//					j=5 j<=4 false
//	i=2 2<=4 true
//					j=1 j<=4 true
}