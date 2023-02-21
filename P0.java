//CSCI 2302 - Denny To
import java.util.Scanner;
public class P0 {
	
	//P0: Count words and characters in a given name
	//Write a program to prompt the user to enter his/her name
	//and then display the number of words and characters in the given name
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int wordCount = 0;
		int charCount = 0;
		int charCountWOSpaces = 0;
		
		System.out.print("Enter your name: "); //prompts user to enter name
		String name = sc.nextLine(); //the next line (name entered) is taken as input
		
		String[] word = name.split("\\s+"); //counts words separated my spaces
		for (String w : word)
			wordCount++;
		
		String[] chars = name.split("\\s*"); //counts successive characters (including spaces)
		for (String w : chars)
			charCount++;
			
		String charsWOSpaces = name.replaceAll("\\s", "");; //removes spaces to then --
		for (int i = 0; i < charsWOSpaces.length(); i++) // -- count successive characters (excluding spaces)
			charCountWOSpaces++;
			
		System.out.print("\n" + "Your name: " + name + "\n" + "Word Count: " + wordCount + "\n" + "Character Count (with spaces): " + charCount +  "\n" + "Character Count (without spaces): " + charCountWOSpaces);
		
	}
}
