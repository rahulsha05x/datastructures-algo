
public class BubbleSort {
	
	public int [] sort(int arr[]){
		for (int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length -i-1; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		}
		return arr;
	}
	 /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90,2,4,5,7,4,5,8,2,3,5,55,44,66,77,88,33,223,3432,343,3432,3432,423,34,234,34,};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
