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
		char[] i = s.toCharArray();
		for(char c: i) {
			while(b && sn.hasNextLine()) {
				String o = sn.nextLine();
				char[] j = o.toCharArray();
				if(i == j) {
					System.out.println(o);
				}
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
