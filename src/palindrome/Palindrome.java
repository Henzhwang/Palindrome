/*
 * @Henry Huang
 * Palindrome.java
 * Feb 20,2019
 * This program is designed to determine the word from the user , and inform them 
 * if it is a palindrome or not.
 */
package palindrome;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Listing all variables used in the program
        String word;
        String backward;
        
        int position;
        
        //Display the definition of palindrome, and ask user for an input
        word = JOptionPane.showInputDialog("Words that are the same forwards and backwards"
                + "are called palindromes." + "\nThis program determines if the words are palindromes." +
                "\n\nEnter a Word:");
        
        //Reverse the input
        backward = "";
        for (position = word.length() - 1; position >= 0; position --)
        {
            backward += word.charAt(position);
        }
        
        //Determine if the input is a palindrome or not
        if (word.equalsIgnoreCase(backward))
        {
            JOptionPane.showMessageDialog(null,word + " in reverse is " + backward +
                    ".\nIt is a palindrome.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,word + " in reverse is " + backward +
                    ".\nIt is not a palindrome.");
        }
    }
    
}
