package demo;

class sky
{
	public void display(int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	
}
class kites extends sky
{
	public void display(double d)
	{
		super.display(3, 4);
		System.out.println(d);
	}
}
public class method_override {

	public static void main(String[] args) {
		kites k = new kites();
		k.display(1.6);
				

	}

}
