package arrayprograms;

public class linearsearch {

	public static void main(String[] args) {
		char[] arr= { 'Z','Q','T','P','I','Y'};
		int n='Y';
		boolean status=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==n) {
				status=true;
				
			}
			

	}
		if(status) {
			System.out.println("ELEMENT IS PRESENT TN ARRAY ");
		}else
		System.out.println("ELEMENT IS NOT PRESENT TN ARRAY");
	}

}
