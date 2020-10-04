import java.util.*;

public class TestArrays
{
	public static void main(String[] args)
	{
		MyArrayList<Integer> list = new MyArrayList<>();
		
		/*/System.out.println("Work with empty list:");
		System.out.println(list.binarySearch(new Integer(3)));
		
		list.add(0,new Integer(3));
		list.add(1,new Integer(5));
		list.add(2,new Integer(7));
		list.add(3,new Integer(8));
		list.add(4,new Integer(12));
		list.add(5,new Integer(17));
		list.add(6,new Integer(24));
		list.add(7,new Integer(29));
		list.sortList();
		
		System.out.println("\nList:");
		System.out.println(list);
		System.out.println("Find key 0:");
		if ((list.binarySearch(new Integer(0)) > 0))
		{
			
			System.out.println("Found: True");
			System.out.println("Index: " + list.binarySearch(new Integer(0)));
		}
		else 
		{
			System.out.println("Found: False");
			System.out.println("Index: " + list.binarySearch(new Integer(0)));
		}
		
		System.out.println("\nList:");
		System.out.println(list);
		System.out.println("Find key 7:");
		if ((list.binarySearch(new Integer(7)) > 0))
		{
			
			System.out.println("Found: True");
			System.out.println("Index: " + list.binarySearch(new Integer(7)));
		}
		else 
		{
			System.out.println("Found: False");
			System.out.println("Index: " + list.binarySearch(new Integer(7)));
		}
		
		System.out.println("\nList:");
		System.out.println(list);
		System.out.println("Find key 9:");
		if ((list.binarySearch(new Integer(9)) > 0))
		{
			
			System.out.println("Found: True");
			System.out.println("Index: " + list.binarySearch(new Integer(9)));
		}
		else 
		{
			System.out.println("Found: False");
			System.out.println("Index: " + list.binarySearch(new Integer(9)));
		} 
		
		System.out.println("\nList:");
		System.out.println(list);
		System.out.println("Find key 50:");
		if ((list.binarySearch(new Integer(50)) > 0))
		{
			
			System.out.println("Found: True");
			System.out.println("Index: " + list.binarySearch(new Integer(50)));
		}
		else 
		{
			System.out.println("Found: False");
			System.out.println("Index: " + list.binarySearch(new Integer(50)));
		}*/
		
		/*list.add(0,new Integer(29));
		list.add(1,new Integer(24));
		//list.add(11,new Integer(5));
		list.add(2,new Integer(17));
		list.add(3,new Integer(12));
		list.add(7,new Integer(8));
		list.add(4,new Integer(35));
		list.add(5,new Integer(7));
		list.add(6,new Integer(105));
		list.add(10,new Integer(5));
		list.add(9,new Integer(55));
		list.add(8,new Integer(3));*/
		
		list.add(0,new Integer(3));
		list.add(1,new Integer(5));
		list.add(2,new Integer(7));
		list.add(3,new Integer(8));
		list.add(4,new Integer(12));
		list.add(5,new Integer(17));
		list.add(6,new Integer(24));
		list.add(7,new Integer(29));
		list.add(8,new Integer(0));
		list.add(9,new Integer(102));
		list.add(10,new Integer(12));
		list.add(11,new Integer(1002));
		list.add(12,new Integer(20));
		list.add(13,new Integer(70));
		list.add(14,new Integer(86));
		
		
		System.out.println("\nList:");
		System.out.println(list);
		
		
		if(list.size()!= null)
		{
			list.insertionSort();
		}
		
		if(list.size() == 1)
		{
			System.out.println(list);
		}
		System.out.println(list);
	}
}