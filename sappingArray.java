package arrayprograms;

public class sappingArray {

	public static void main(String[] args) {
		int[] arr= {10,3,5,2,4};
		int mid=arr.length/2;
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[mid+i];
			arr[mid+i]=temp;
			
		}
		System.out.println("sorted data is : ");
		for(int k: arr) {
			System.out.println(k);
		}

	}

}
