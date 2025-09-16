package com.app;

public class Reverse {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//	i=1 1<=5 true
//					j=1 1<=5 true
//					j=2 2<=5 true
//					j=3 3<=5 true
//					j=4 4<=5 true
//					j=5 5<=5 true
//					j=6 6<=5 false
//					*****
//	i=2 2<=5 true
//					j=2 2<=5 true
//					j=3 2<=5 true
//					j=4 2<=5 true
//					j=5 2<=5 true
//					j=6 2<=5 false
//					****
//	i=3 3<=5 true
//					j=3 3<=5 true
//					j=4 4<=5 true
//					j=5 5<=5 true
//					j=6 6<=6 false
//					***
			
}
