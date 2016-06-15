
public class SelectionSort {

	public static void main(String[] args) {
		// Selection Sort
		int arr[] = { 7, 8, 3, 1, 20, 4 };
		applySelectionSort(arr);
		printOutput(arr);

	}

	public static void applySelectionSort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void printOutput(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
