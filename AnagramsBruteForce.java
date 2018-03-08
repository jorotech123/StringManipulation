
public class AnagramsBruteForce {

	public static void main(String[] args) {
		// For example, bacdc and dcbwc are anagrams, but bacdc and dcbad are
		// not.
		String s1 = "abac";
		String s2 = "cbaa";

		boolean status = checkIfAnagrams(s1, s2);
		if (status) {
			System.out.println("s1 and s2 are anagrams");
		} else {
			System.out.println("s1 and s2 are not anagrams");
		}
	}

	private static boolean checkIfAnagrams(String s1, String s2) {
		boolean status = true;
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 != len2) {
			status = false;
			return status;
		}
		String s1buffer = s1;
		String s2buffer = s2;

		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			char ch = s1.charAt(i);

			while (count < s2.length()) {
				char ch2 = s2.charAt(count);
				System.out.println(ch + " ------ " + ch2);
				if (ch == ch2) { 
					s1buffer = s1buffer.substring(s1buffer.indexOf(ch) + 1, s1buffer.length());
				}
				s2buffer = s2buffer.replace(ch, '@');
				count++;
			} // while loop end
		} // for loop end

		int countSymbol = 0;
		for (int i = 0; i <= s2buffer.length() - 1; i++) {
			char ch = s2buffer.charAt(i);
			if (ch == '@') {
				countSymbol = countSymbol + 1;
			}
		}
		if (countSymbol == s2buffer.length()) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

}
