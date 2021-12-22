package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		/**
		 * Collection<String> names = new ArrayList<>(); for (String name : names) {
		 * System.out.println(name); } names.stream().forEach(name ->
		 * System.out.println(name)); /// linked list Collection<String> linkedList =
		 * new LinkedList<>(); for (String name : linkedList) {
		 * System.out.println(name); } linkedList.stream().forEach(name ->
		 * System.out.println(name));
		 */

		for (int i = 0; i < 10; i++)
			System.out.println(new Random().nextInt());

		
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream();
		/*
		 * Node<String> root = new Node<>(null, null, "First Value"); Node<String> root2
		 * = new Node<>(root, null, "Second Value"); root.setNext(root2); Node<String>
		 * root3 = new Node<>(root2, null, "Third Value"); root2.setNext(root3);
		 * Node<String> root4 = new Node<>(root3, null, "4 Value");
		 * root3.setNext(root4);
		 * 
		 * println(root);
		 */
	}

	static void println(Node node) {
		System.out.println(node.getValue());
		Node next = node.getNext();
		if (next != null) {
			println(next);
		}
	}

}
