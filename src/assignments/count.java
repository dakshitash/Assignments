package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class count {
private static Scanner scan;

public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	map.put("Consonant", 0);
	map.put("Vowel", 0);
	System.out.println("Enter a string");
	scan = new Scanner(System.in);
	String inp = scan.nextLine();
	char[] inpchar = inp.toCharArray();
	
	for (int i = 0 ; i<inpchar.length ; i++) {
		if (inpchar[i]=='a' || inpchar[i]=='e' || inpchar[i]=='i' || inpchar[i]=='o' || inpchar[i]=='u' ) {
			map.put("Vowel", map.get("Vowel")+1);
		}
		else {
			map.put("Consonant", map.get("Consonant")+1);
		}
	}
	System.out.println(map);
	
}
}
