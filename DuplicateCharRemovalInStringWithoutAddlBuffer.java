
public class DuplicateCharRemovalInStringWithoutAddlBuffer {

	public static void main(String[] args) {
		char A[] = { 'a', 'u','u','u','c', 'a', 'a', 'a', 'a','y','y','a','v','b', 'b', 'g','g','z' };
		char replace=' ';
		char lastchar=A[A.length-1];
		for (int i = 0; i < A.length; i++) {
			int d = countSubse(A, i);
			// shift the chars for the counter u get
			int shift = i;
			int newindex=i + d+1; //take the char which has to replace all the previous duplicate chars
			while (d > 0 && newindex<A.length)  {
				 replace = A[newindex];
				A[shift+1] = replace;
				shift=shift+1;
				d--;
			}
			if(replace==lastchar){
				A[newindex]='$';
			}
			System.out.println(i+"     i & d "+i+"   ----------   "+d);
			System.out.println(A);
		}
	}

	public static int countSubse(char[] A, int index) {
		int len = A.length;
		int counter = 0;
		while (index < len - 1 && (A[index] == A[index + 1])) {
			// System.out.println(A[index] + " -###- " + A[index + 1]);
			char chs = A[index];
			char chf = A[index + 1];
			if (chs == chf) {
				counter = counter + 1;
			}
			index++;
		} // outer while close

		return counter;
	}

}
