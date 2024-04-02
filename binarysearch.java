package arrayprograms;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		search(arr, 10, 0, arr.length-1);

	}
	public static void search(int arr[],int n,int st,int ed) {
		
		if(st<=ed) {
			int mid=(ed-st)/2+st;
			if(arr[mid] ==n) {
				System.out.println("element is found ");
			}else if(arr[mid]>n) {
				search(arr,n,st,mid-1);
			}else {
				search(arr,n,mid+1,ed);
			}
		}
	}

}
