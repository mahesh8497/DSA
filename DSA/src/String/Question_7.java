package String;

public class Question_7 {
//Write a program to get the length of a given string. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahesh";
		// Sample input

        // Variable to hold the length
        int length = 0;

        // Loop through the string character by character
        for (int i = 0; i<s.length(); i++) {
           
                // Try accessing the character at index i
                char c = s.charAt(i);
                length++;  // Increment the length counter    
        }
        System.out.println("The length of the string is: " + length);
    }
}