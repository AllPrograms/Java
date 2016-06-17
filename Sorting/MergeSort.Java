
public class MergeSort {

	public static void main(String[] args) {
		// Merge Sort
		int arr[] = { 7, 8, 3, 1, 20, 4 };
		applyMergeSort(arr);
		printOutput(arr);

	}

	public static void applyMergeSort(int arr[]) {
		int mid = (arr.length) / 2;
		if(arr.length<2)
		{
			return;
		}
		int leftarr[] = new int[mid];
		int rightarr[] = new int[arr.length-mid];
		for (int i = 0; i < mid; i++) {
			leftarr[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			rightarr[i - mid] = arr[i];
		}
		applyMergeSort(leftarr);
		applyMergeSort(rightarr);
		applyMerge(arr, leftarr, rightarr);
	}

	public static void applyMerge(int arr[], int leftarr[], int rightarr[]) {
		int i = 0, j = 0, k = 0;
		int nl = leftarr.length;
		int rl = rightarr.length;

		while (i < nl && j < rl) {
			if (leftarr[i] < rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
				k++;
			} else if (rightarr[j] < leftarr[i]) {
				arr[k] = rightarr[j];
				j++;
				k++;
			}
		}
		while (i < nl) {
			arr[k] = leftarr[i];
			i++;
			k++;

		}
		while (j < rl) {
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}

	public static void printOutput(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
