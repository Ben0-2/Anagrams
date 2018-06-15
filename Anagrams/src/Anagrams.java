import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Array;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagrams {
	
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.findAnagrams();
	}
void findAnagrams() {
	try {
		String fileName = "jakepaul.txt";
		boolean b = false;
		Scanner sn = new Scanner(new File("jakepaul.txt"));
		String s = JOptionPane.showInputDialog("Give me a word, no gibberish plz");
		while(sn.hasNextLine()) {
			String a = sn.nextLine();
			if(a.equals(s)) {
				b=true;
				
			}
			
		}
		
		if(!b) {
			System.out.println("Try a different word next time!");
			System.exit(0);
		}
		sn = new Scanner(new File("jakepaul.txt"));
		char[] i = s.toCharArray();
		
		boolean b2 = false;
		boolean b3 = true;
		while(sn.hasNextLine()) {
			String o = sn.nextLine();
			char[]j = o.toCharArray();
			if(o.length() == s.length()) {
			for(int k = 0; k<i.length; k++) {
				for(int c = 0; c<j.length; c++) {
					if(i[k] == j[c]) {
						i[k]  = '6';
						j[c]= i[k];
					}
				}
			}
			
			System.out.println(i);
			System.out.println(j);
			for(char c2: i) {
				for(char c3: j) {
					if(c2 != c3) {
						b3 = false;
					}
				}
			}
			if(b3) {
				System.out.println(o + " is an anagram for " + s + "!");
				b2 = true;
			}
			}
			
			
			
			
			i = s.toCharArray();
			
			
		}
		if(!b2) {
			System.out.println("No anagrams for " + s + ". Sorry!");
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
