
public class BinarySearch {
	public int search (int arr[],int l,int r,int num) {
		if (r > l) {
			int mid = l + (r-l)/2; 
			if (arr[mid] == num)
				return mid;
			else if (num < arr[mid]){
				return search(arr,l,mid - 1, num);
			}
			
				return search(arr,mid + 1,r, num);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int arr[] = new int[]{1,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int num = 16;
		int number = bs.search(arr, 0, arr.length, num);
		if (number == -1)
			System.out.println(num+" not found");
		if(number != -1)
			System.out.println(number+" is found");
		
	}

}
