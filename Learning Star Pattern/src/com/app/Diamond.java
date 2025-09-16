package com.app;
import java.util.Scanner;
public class Diamond {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num : ");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		System.out.print("   ");
		for(int j=1;j<=num-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=num;i>=1;i--)
	{
		System.out.print("   ");
		for(int j=1;j<=num-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
