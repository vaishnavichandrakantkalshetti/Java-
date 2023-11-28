class Area
{
	public void Area()
	{
		System.out.println("Area of Different Shapes are:");
	}
}

class Square extends Area
{
	public void Area()
	{
		System.out.println("Area of Square is: side*side");
	}
}

class Circle extends Area
{
	public void Area()
	{
		System.out.println("Area of Circle is: pi*r*r");
	}
}

class Area_Main
{
	public static void main(String [] args)
	{
		Area a=new Area();
		Square s=new Square();
		Circle c=new Circle();
		
		a.Area();
		s.Area();
		c.Area();
		
	}
}