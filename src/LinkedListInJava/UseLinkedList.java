package LinkedListInJava;
/**
 *In here importing class, which are belong from java.util.package
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * 
 * @author Vishwas
 * In this program i'll use LinkedList to add element
 * reverse direction to element ,Join an ArrayList at 
 * the end of LinkedList and Implement the LinkedList 
 * as a Queue(FIFO).
 * fist i've created a class name UseLinkedList and main method 
 *
 */

public class UseLinkedList {

	public static void main(String[] args) {
		/**
		 * In here using LikedList and in angular bracket 
		 * passing String because i'm adding String type of data
		 * in LikedList;
		 * than i've declare variable name and using it as reference
		 * and calling add() method to store elements in LikedList;  
		 */
		LinkedList<String>name=new LinkedList<String>();
		name.add("sam");
		name.add("ram");
		name.add("sid");
		name.add("mak");
		// In here adding a elements in first as mention is question; 
		name.addFirst("raj");
		/**
		 * in here using to ListIterator elements one-by-one 
		 * from this List implemented object.
		 * than i've used while condition and call hasNext()
		 * The hasNext( ) method returns true if there is a 
		 * next element. Otherwise, returns false.
		 */
		ListIterator<String> iterator = name.listIterator();
		while (iterator.hasNext())
		    System.out.println(iterator.next());
		
		/**
		 * than i've used while condition and call hasPrevious()
		 * The hasPrevious( ) method returns true if there is a 
		 * previous element. Otherwise, returns false.
		 */
		    System.out.println("After reverse");
		
		while (iterator.hasPrevious())
		    System.out.println(iterator.previous());
		/**
		 * in here joining array list 
		 */
		
		System.out.println("Join an ArrayList");
		
		  List<String> nameList = new ArrayList<String>(name);

		    for (String string : nameList)
		      System.out.println(string);
		
	}


	
}
