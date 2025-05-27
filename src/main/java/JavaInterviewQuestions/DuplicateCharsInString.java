package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateCharsInString {
	
	@Test
	public void UsingSet() {
		String string="lhllfglnltlfg";
		Set<String> set=new HashSet<>();
		boolean s=set.add(string);
		System.out.println(s);
	}

	//@Test
	public void duplicatechars() {
		String s="oughrhghhbsbdirfj";
		char[] chareArray=s.toCharArray();
		for(int i=0;i<chareArray.length;i++) {
			for(int j=i+1;j<chareArray.length;j++) {
				if(chareArray[i]==chareArray[j]) {
					System.out.println(chareArray[j]);
				}
			}
		}
	}
	        
	//@Test  
	public static void findDuplicateCharacters() {
	    	String string = "programming";
	        int[] count = new int[256]; // Assuming ASCII characters

	        // Count occurrences using a for loop
	        for (int i = 0; i < string.length(); i++) {
	            count[string.charAt(i)]++;
	        }

	        // Print duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        for (int i = 0; i < 256; i++) {
	            if (count[i] > 1) {
	                System.out.println((char) i + " - " + count[i] + " times");
	            }
	        }
	    }
	}

