package arrayprograms;

public class maxNo2d {

	public static void main(String[] args) {
		int[][] arr= {
				{ 10, 20 },
				{ 30, 40, 50, 60, 77, 100, 333},
				{ 90, 80, 70 },
				{ 100, 110, 120, 140},
				
		};
		
		int maxid=0;
		int fri=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}System.out.println(sum);
			if(sum>maxid) {
				maxid=sum;
				fri=i;
				
			}
			
		}System.out.println("max array is : "+maxid +" and index is : "+fri); 
		
		
	}

}

//30
//690
//240
//470
//max array is : 690 and index is : 1

