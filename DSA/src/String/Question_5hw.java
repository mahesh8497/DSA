package String;

public class Question_5hw {
//Write a program to get the index of all the characters of the alphabet. 
	public static void main(String[] args) {
	;
		 // Loop through uppercase letters 'A' to 'Z'
        System.out.println("Uppercase Alphabet Index:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " -> " + ((int) ch - (int) 'A'));
        }

        // Loop through lowercase letters 'a' to 'z'
        System.out.println("\nLowercase Alphabet Index:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " -> " + ((int) ch - (int) 'a'));
        }

	}

}
