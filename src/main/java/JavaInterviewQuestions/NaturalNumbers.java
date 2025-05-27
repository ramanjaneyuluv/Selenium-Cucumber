package JavaInterviewQuestions;

import org.testng.annotations.Test;

public class NaturalNumbers {
	
	@Test
	public void printNaturalNumbers() {
		int n=0;
		while(n>=0) {
			int num =n*(n+1)/2;
			System.out.println(num);
			num++;
		}
	} 
}
