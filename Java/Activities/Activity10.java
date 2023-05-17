package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("JAVA");
		hs.add("SELENIUM");
		hs.add("SQL");
		hs.add("API");
		hs.add("JENKINS");
		hs.add("GIT");

		System.out.println("Original HashSet: " + hs);
		System.out.println("Size of HashSet: " + hs.size());
		System.out.println("Removing A from HashSet: " + hs.remove("API"));
		if (hs.remove("SQL")) {
			System.out.println("SQL removed from the Set");
		} else {
			System.out.println("SQL is not present in the Set");
		}
		System.out.println("Checking if GIT is present: " + hs.contains("GIT"));
		System.out.println("Updated HashSet: " + hs);
	}
}