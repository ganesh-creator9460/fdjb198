package Task;

public class Hallow_Rectangle {

	public static void main(String[] args) {
		
		int row=4;
		int col=5;
		for(int i=1;i<=row;i++)
		{
			System.out.print(" ");
			for(int j=1;j<=col;j++)
			{
				System.out.print(" ");
				if(i==1 || i==row || j==1 || j==col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
