package arrayprograms;

public class SumOfRow2d {

	public static void main(String[] args) {
		int[][] arr= {
				{ 10, 20 },
				{ 30, 40, 50, 60 },
				{ 90, 80, 70 },
				{ 100, 110, 120, 140},
				
		};
		
		
		for(int[] ar1:arr) {
			int sum=0;
			for(int ar2:ar1) {
				sum+=ar2;
			}System.out.println(sum);
		}
		
	}

}
//output : 
//30
//180
//240
//470

