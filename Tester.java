class Employee
{
	int bonus = 15000;
}
class Tester extends Employee
{
	int salary=40000;
	
	public static void main(String [] args)
	{
		
		
		Tester t=new Tester();
		
		System.out.println("Employee salary is: "+t.salary+" Employee bonus is:"+t.bonus);
		
	}
}

