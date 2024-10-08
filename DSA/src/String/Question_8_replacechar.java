package String;

public class Question_8_replacechar {

	public static void main(String[] args) {
		 // Sample input string
        String s = "sham";//inputString

        // Create an empty string to store the result
        String s1 = "";//resultString

        // Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the current character is 'd', replace it with 'f'
            if (currentChar == 's') {
                s1 = s1+'a';
            } 
            else {
                // Otherwise, keep the current character
                s1 = s1+currentChar;
            }
        }
        // Output the result
        System.out.println("Original String: " + s);
        System.out.println("Modified String: " + s1);
    }
}