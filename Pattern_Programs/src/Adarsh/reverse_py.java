package Adarsh;

public class reverse_py {

		    public static void main(String args[]) {
		      int i,j;
				for(i=5;i>=1;i--)//
				{
					for(j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(j=1;j<=2*i-1;j++) // Inner Loop
					{
						System.out.print("*");
					}
					System.out.println();
				}
      }
}



