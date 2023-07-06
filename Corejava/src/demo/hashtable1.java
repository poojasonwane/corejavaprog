package demo;

import java.util.*;

public class hashtable1
{
	
	public static void main(String args[])
	{
		Hashtable<Integer,String> ht = new Hashtable<Integer,String> ();
		ht.put(110,"Abc");
		ht.put(130,"Xyz");
		ht.put(170,"Lmn");
		ht.put(120,"Pqr");
		
		System.out.println(ht);
	}

}
