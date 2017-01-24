package edu.gatech.oad.antlab.person;

import java.util.ArrayList;
import java.util.List;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob, Shanmukha Srikrishna Abhishek Tumuluru
 * @version 1.1
 */
public class Person2 {
	/** Holds the persons real name */
	private String name;
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person2(String pname) {
		name = pname;
	}
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		//Person 2 put your implementation here
		List<Integer> map = new ArrayList<>();
		while (map.size() < input.length()) {
			int randomNum = (int) (Math.random() * input.length());
			if (!map.contains(randomNum)) {
				map.add(randomNum);
			}
		}
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < map.size(); ++i) {
			s.append(input.charAt(map.get(i)));
		}
		return s.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
		return name + calc(input);
	}
}