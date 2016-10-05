package me.xiaobailong24.collection;

import java.util.*;

public class IteratorDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// Create an array list
		ArrayList<String> al = new ArrayList<String>();

		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// Use iterator to display contents of al
		System.out.println("Original contents os al: ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// Modify objects being iterated
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			litr.set(litr.next() + "+");
		}
		System.out.println("Modified contents os al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// Now, display the list backwards
		System.out.println("Modified list backwards: ");
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println();
	}

}
