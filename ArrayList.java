package Collection;
//Coversion of ArrayList to Array
import java.util.ArrayList;

public class altest1 {
	
	public static void main(String[] args) {
		
1)// Conversion of ArrayList to Arry 
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

2)//ArrayList
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

3)// Conversion of Array to ArrayList
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


4)//Conversion of ArrayList to String

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
//5) Sorting of ArrayList
class alist4{
	public static void main(String[] args) {
		
		 ArrayList<String> alist=new ArrayList<String>();
		 alist.add("C");
		 alist.add("B");
		 alist.add("A");
		 alist.add("D");
		 
		 System.out.println("Before sorting: "+alist);
		 
		 Collections.sort(alist);
		 
		 System.out.println("After sorting:"+alist);
		 
		 Collections.sort(alist,Collections.reverseOrder());
		 System.out.println("After sorting:(Des)"+alist);
		 
		 
		
	}
}//class ends

//6) Creating a subList from given Arraylist

class aList{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		
		System.out.println("Array list Before:"+alist);
		
		ArrayList<Integer> li=new ArrayList<Integer>(alist.subList(1, 3));
		System.out.println("Array Sublisted:"+li);
			
	}
}//class ends

//7) Swap two elements in arraylist

import java.util.ArrayList;
import java.util.Collections;

public class altest4 {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		Collections.swap(al, 1, 3);
		System.out.println(al);
	}

}/class ends

//8) Clone()
class altest6{
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("Orignal Array list:"+al);
		
		ArrayList<String> al1= (ArrayList<String>)al.clone();
		
		System.out.println("Clone Array:"+al1);
		
		al.add("E");
		System.out.println("New Array List:"+al);
		System.out.println("New Clone Array:"+al1);	
		
	}
	
}

//9) Stack in Array list push(),pop(),search(),peek(),empty()


import java.util.Stack;
public class Stackalist {

	public static void main(String[] args) {
		
	Stack<String> li=new Stack<>();
	li.push("A");
	li.push("B");
	li.push("C");
	li.push("D");
	
	System.out.println(li);
	
	
	System.out.println(li.peek());
	
	li.pop();
	System.out.println(li);
	System.out.println(li.peek());
	System.out.println(li.search("A"));
	//li.clear();
	System.out.println(li.empty());
	
	
	}

}//class ends

//10)





























