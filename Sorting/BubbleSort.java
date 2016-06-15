
public class  BubbleSort {

	public static void main(String[] args) {
		// BubbleSort Sort
		int arr[] = { 7, 8, 3, 1, 20, 4 };
		applyBubbleSort(arr);
		printOutput(arr);

	}

	public static void applyBubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
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
