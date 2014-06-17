//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/15/14			Project 20.14
//
//	CSC*E224				Programming Assignment IV		Problem 2
//****************************************************************************************

package edu.housatonic.www.assignment4.problem2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LetterTypeCount {
	
	public static void main(String[] args){
		
		//Create HashMap to store String keys and Integer values
		Map<String, Integer> myMap = new HashMap <String, Integer>();
		
		createMap(myMap);	// create map based on user input
		displayMap(myMap);	// display map content
	} // end main
	
	
	/*_________________________________________________*/
	// create map from user input
	private static void createMap(Map<String, Integer> map){
		
		Scanner scanner = new Scanner(System.in);	// create scanner
		String input = scanner.nextLine();	// Prompt for user input
		
		String[] tokens = new String[input.length()];
		//tokenize the input
		for (int i = 0;i < input.length(); i++){
				tokens[i] = String.valueOf(input.charAt(i));

		}
		
		// Processing input text
		for(String token: tokens){
			
			String letter = token.toLowerCase();	// get lowercase word

			// if the map contains the word
			if(!token.equals(" ")){ // if is not white space
				if(map.containsKey(letter)){	// is word in map
					int count = map.get(letter);	// get current count
					map.put(letter, count +1);	// increment count
				}	// end if
				else
					map.put(letter,  1); // add new word with a count of 1 to map
			}
		}	// end for
	}	// end method createMap
	
	/*_________________________________________________*/
	
	// display map content
	private static void displayMap(Map<String, Integer> map){
		
		Set<String> keys = map.keySet();
		
		//Sort keys
		TreeSet<String> sortedKeys = new TreeSet<String>(keys);
		
		System.out.println("\nMap contains:\nKey\t\tValue");
		
		// generate output for each key in map
		for(String key: sortedKeys)
			System.out.printf("%-10s%10s\n", key, map.get(key));
		
		System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
	}	// end method displayMap
	
}	// end class LetterTypeCount
