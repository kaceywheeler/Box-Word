//Kacey Wheeler
//AP Computer Science: 3B
//12-7-19
//Nested Loops Labs Part 1
//Box Word Runner

import java.util.Scanner;

public class BoxWordRunner {
	public static void main (String args[] ) {
		
		//Create new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get number input from user
		System.out.println("Enter a word: ");
		String word = keyboard.next();
		
		//Create new reference object 
		BoxWord ref = new BoxWord();
		
		//Call method
		System.out.println(ref.boxPattern(word));
		
	}
}