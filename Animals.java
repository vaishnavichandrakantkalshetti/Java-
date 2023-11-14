class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}

class Animals
{
	public static void main(String [] args)
	{
		Animal a=new Animal();
		Dog d=new Dog();
		
		//a.eat();
		//a.sleep();	
		
		d.bark();
		d.eat();
		d.sleep();
	}
}