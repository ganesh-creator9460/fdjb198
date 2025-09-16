package Task;

public class Pascle_Triangle {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++)
		{
			for(int j=i;j<=4;j++)  //space
			{
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
