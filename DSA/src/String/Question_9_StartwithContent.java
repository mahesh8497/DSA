package String;

//Write a program to check whether a given string starts with the contents of another string. 
public class Question_9_StartwithContent {
	public static void main(String[] args) {
		String s="hefshine";
		String s1="e";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s.charAt(i)!=s1.charAt(i))
				count++;
			break;
		}
		if(count==0)
			System.out.println("True");
		else {
			System.out.println("False");
		}
	}
}
