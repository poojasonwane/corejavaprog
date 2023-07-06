package demo;

class student
{
	public int a;
	
	public void display()
	{
		System.out.println(a);
	}
	
}
public class accessmodifiers 
{
	public static void main(String args[])
	{
		student s1 = new student();
		s1.a=10;
		s1.display();
	}
}
