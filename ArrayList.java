package Collection;

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













