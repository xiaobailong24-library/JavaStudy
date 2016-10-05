package me.xiaobailong24.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Create and initialize linked list
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));

		// Create a reverse order comparator ½µÐò
		Comparator r = Collections.reverseOrder();

		// Sort list by using the comparator
		Collections.sort(ll, r);

		// Get iterator
		Iterator li = ll.iterator();
		System.out.println("List sorted in reserse: ");

		while (li.hasNext()) {
			System.out.println(li.next() + " ");
		}
		System.out.println();
		Collections.shuffle(ll);

		// display randomized list
		li = ll.iterator();
		System.out.println("List shuffled: ");

		while (li.hasNext()) {
			System.out.println(li.next() + " ");
		}

		System.out.println();
		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maxinum: " + Collections.max(ll));

	}

}
