package demo;

class sample
{
	public void get(int x , int y)
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	public void get(float x)
	{
		System.out.println(x);
	}
	
}
public class method_overload {

	public static void main(String[] args) {
		sample s1 = new sample();
		s1.get(2,4);
		s1.get((float) 1.6);

	}

}
