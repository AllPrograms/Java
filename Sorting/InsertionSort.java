
public class InsertionSort {

	public static void main(String[] args) {
		// BubbleSort Sort
		int arr[] = { 7, 8, 3, 1, 20, 4 };
		applyInsertionSort(arr);
		printOutput(arr);

	}

	public static void applyInsertionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}

	}

	public static void printOutput(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
