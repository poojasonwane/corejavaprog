package demo;

class Student_core
{
	int id;
	String name;
	public void get(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		
		System.out.println(id);
		System.out.println(name);
	}
}
public class this_keyword  {

	public static void main(String[] args) {
		Student_core s1 = new Student_core();
		s1.get(101,"pooja");
		s1.display();
	}

}
