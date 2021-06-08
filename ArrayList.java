package Collection;
//Coversion of ArrayList to Array
import java.util.ArrayList;

public class altest1 {
	
	public static void main(String[] args) {
		
		// Conversion of ArrayList to Arry 
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		alist.add("E");
		System.out.println(alist);
		
		String[] arr=new String[alist.size()];
		
		alist.toArray(arr);
		System.out.println("Array:");
		
		for(String s:arr)
			System.out.println(s);
		System.out.println("Array length:"+arr.length);
		
	}}//class ends
//ArrayList
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class altest {

	public static void main(String[] args) {
		
		ArrayList<String> fruits=new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Watermelon");
		ArrayList<Integer> qty=new ArrayList<Integer>();
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);
		
		//we have to uses set()

		//qty.set(1, 50);
		
		//remove element
		
		qty.remove(1);
		
		fruits.remove("Watermelon");

		for(String s:fruits)
			System.out.println(s);
		
		
		System.out.println(qty);
		//Size()
		System.out.println("Fruits Size: "+ fruits.size());
		System.out.println("Qty Size: "+ qty.size());
		//get()
		
		System.out.println(fruits.get(1));
		System.out.println(qty.get(0));
		fruits.clear();
		System.out.println("Fruits Size Ater "+fruits.size());
		System.out.println(qty.isEmpty());
		System.out.println(fruits.isEmpty());
		
		//how to copy all elements to another arry
		
		ArrayList<Integer> qty1=new ArrayList<Integer>();
		qty1.addAll(qty);
		
		qty1.add(80);
		qty1.add(81);
		qty1.add(82);
		
		System.out.println(qty1);
		
		//reverse()
		Collections.reverse(qty1);
		System.out.println(qty1);
		
		
	}

}//class ends
// Conversion of Array to ArrayList
package Collection;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class altest2 {

	public static void main(String[] args) {
		Integer[] arr= {1,2,3};
		
		for(Integer s:arr)
	System.out.println(s);
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Array: "+alist);

	}

}//class ends

//Conversion of ArrayList to String

class altest3{
	
	public static void main(String[] args) {
		
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("I-phone");
	alist.add("Samsung");
	alist.add("vivo");
	alist.add("oppo");
	
	String S=alist.toString();
	System.out.println("Array list is:"+S);
	
	System.out.println("Size of ArrayList:"+alist.size());
	System.out.println("Size of lenght:"+S.length());
	
		
	}
}//class ends




























