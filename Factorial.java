import java.util.Scanner;
class Factorial
{
	public static void main(String [] args)
	{
		int i,fact=1,num;
		
		
		Scanner s = new Scanner(System.in);
	    num = s.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(+fact);
	}	
}