
public class ArrayLeftRotation {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 }; // 12345 //23451 //34512 //45123 //51234
		int rotate = 4;
		int buffer = 0;
		int times = 0;
		while (times < rotate) {
			int count = 0;
			buffer = a[count];

			for (int i = 0; i < a.length; i++) {
				if (i < a.length - 1) {
					a[i] = a[i + 1];
				}
			}
			
			a[a.length - 1] = buffer;
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.print("\n");
			times++;
		}
	}

}
