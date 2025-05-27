package JavaInterviewQuestions;

import org.testng.annotations.Test;

public class DuplicateIntegerValues {

	@Test
	public void duplicateIntegerValues() {
		int originalInteger=2435355;
		int duplicate=0, remender;
		int i=0;
		while(i<=0) {
			remender=originalInteger%10;
			duplicate=remender*10+remender;
			originalInteger=originalInteger/10;
		}
		System.out.println(duplicate);
	}
}
