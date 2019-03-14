package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<String> list = new LinkedList<String>();
		list.add("Ebay");
		list.add("Amazon");
		list.add("CraigsList");
		list.add("Facebook");

		Iterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}
