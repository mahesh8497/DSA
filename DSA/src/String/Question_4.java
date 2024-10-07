package String;

public class Question_4 {
//remove duplicate element in string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdwqsad";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			int rank=0;
			for (int j = i+1; j < s.length(); j++) 
			{
			if(s.charAt(j)==ch) {
				rank++;
			}
			}
		if(rank==0)
			System.out.print(ch+" ");
			
		}

	}

}
