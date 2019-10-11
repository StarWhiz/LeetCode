
public class stringManipulation {

	public static void main(String[] args) {
		//String testString = "2-4A0r7-4k";
		//String testString = "5F3Z-2e-9-w";
		//String testString = "2-5g-3-J";
		//String testString = "--------EyRfCyHxyUJzhygiazYpjuDFdHvrnDwoQKQEsccLDiwhpmjueADIzqIvExbDDFnEGovAxYeszbzuTekRuWUPXRPbVKJuDQzIzzTj";
		
		String testString = "a-a-a-a";
		
		String testOutput;
		Solution solver = new Solution();
		testOutput = solver.licenseKeyFormatting(testString, 1);
		System.out.print("   Test Output: ");
		System.out.println(testOutput);
		
		//System.out.println("Correct Output: EYRF-CYHXYUJZHYGIAZYP-JUDFDHVRNDWOQKQE-SCCLDIWHPMJUEADI-ZQIVEXBDDFNEGOVA-XYESZBZUTEKRUWUP-XRPBVKJUDQZIZZTJ");
		//System.out.println("Correct Output: 24A0-R74K");
		//System.out.println("Correct Output: 5F3Z-2E9W");
		//System.out.println("Correct Output: 2-5G-3J");
	}
}
