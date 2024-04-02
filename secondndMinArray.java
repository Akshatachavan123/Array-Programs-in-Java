
//find the second last min value 
package arrayprograms;

public class secondndMinArray {

	public static void main(String[] args) {
		int arr[]= {12,3,9,19,8,9,4,3};
		int min1=arr[0];
		int min2=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]!=min1 && arr[i]<min2) {
				
				min2=arr[i];
			}
		}
		System.out.println("first min, value "+min1);
		System.out.println("second min value "+min2);
		
	}

}
