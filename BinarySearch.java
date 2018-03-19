// Loop (ends when we find the index)
// numberSearch to middlenumber
// if (numberSearch is greater)
// continue the loop, but this time, search the
// upper half
// else
// continue the loop,9 but this time, search the
// lower half

//8 9 7 6 2 3 5 4 //  nlog n 

//8    9     7   6   2   3   5  4  = here there are 8 operations but it has to be read as n operatiosna s the constant can be ignored

//89   67   23   45

//6789   2345

//23456789

//merge(array1,array2){
// array1 and array2 are both already sorted.
//}

//mergeSort(array){mergeSort(first half of array)mergeSort(second half of array)merge(first half of array,second half of array)}

public class BinarySearch {

	// bubble sort => n^2
	// merge sort => nlogn
	// 1000 => 10 2^10
	// 2000 => 11 = 2^11
	// whenever u increase the input size by doubling, the number of operations
	// increases by 1
	public static void main(String[] args) {// log n is
		int[] a = { 33, 44, 55, 77, 99, 115, 117, 121 };
		int numberSearch = 125;
		int len = a.length;
		int left = 0, right = len - 1;
		int middle = 0;

		// 2 number cases.. does not exist
		while (a[middle] != numberSearch && left < right) {
			middle = (left + right) / 2;
			System.out.println("Left and right and  middle and  element is  " + left + "  ----  " + right + " -------  "
					+ middle + "   element    " + a[middle]);
			if (numberSearch > a[middle]) {
				left = middle + 1;
			}
			if (numberSearch < a[middle]) {
				right = middle - 1;
			}
			if (a[middle] == numberSearch) {
				System.out.println("number found   " + a[middle] + " and the index is " + middle);
				break;
			}

			if (left == right) {
				System.out.println("The number is not found ");
				break;
			}
		}

	}

}