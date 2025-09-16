package Task;

public class ButterFly {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=8-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=8-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
