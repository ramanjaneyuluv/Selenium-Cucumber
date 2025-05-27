package JavaInterviewQuestions;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void reversString() {
		String s="String";
		String reverse="";
		char ch;
		for(int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			reverse+=ch;
		}
		System.out.println(reverse);
	}
	
	@Test
	public void reverseStringUsingWhileLoop() {
		String string="Baby girl";
		String reverse1="";
		char ch;
		int i=string.length()-1;
		while(i>=0) {
			ch=string.charAt(i);
			reverse1+=ch;
			i--;
		}
		System.out.println(reverse1);
	}

}
