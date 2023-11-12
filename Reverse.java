import java.util.*;

class Reverse
{
	public static void main(String [] args)
	{
		int num,rev=0,remainder;
		System.out.println("Enter a number");
		
		Scanner s= new Scanner(System.in);
		num =s.nextInt();
		
		while(num>0)
		{
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
			
		System.out.println(rev);
		}
	}
}