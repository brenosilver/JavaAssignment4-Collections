//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/15/14			Project 20.20
//
//	CSC*E224				Programming Assignment IV		Problem 3
//****************************************************************************************

package edu.housatonic.www.assignment4.problem3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeeSetSort {

	
	public static void main(String[] args) {
		sortTreeSet();
	}
	
	
	public static void sortTreeSet(){
		
		// Ask user for input
		Scanner scan = new Scanner(System.in);
		System.out.println("String to be tokenized:");
		String input = scan.nextLine();
		
		System.out.println("Tokenize by:");
		String tokenizeBy = scan.nextLine();
		
		
		// Compare the Strings to order
		Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String aStr = a;
                String bStr = b;
                return aStr.compareTo(bStr);
            }
        };
		
		// Tokenize the String and put it in the array
		String[] array = input.split(tokenizeBy);

		// Add to the TreeSet in ascending order
		TreeSet<String> tokens = new TreeSet<String>(comparator);
        for (String str : array) {
        	tokens.add(str);
        }
		
		// Display the TreeSet
        for (String element : tokens)
            System.out.print(element + " ");
		
	}

}
