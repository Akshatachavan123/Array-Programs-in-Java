package arrayprograms;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT OF ARRAY ");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
		 System.out.println("ENTER THE VALUES ");
		 arr[i]=sc.nextInt();
		
		}
		System.out.println("--------------------");
//		System.out.println("VALUES OF ARRAY IS : ");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		int sum=0;
		for(int j=0;j<a;j++) {
//			System.out.println(arr[j]);
			sum+=arr[j];
			
		}
		System.out.println("SUM OF ARRAY IS : "+sum);
		
	}

}

//ENTER THE LIMIT OF ARRAY 
//3
//ENTER THE VALUES 
//3
//ENTER THE VALUES 
//4
//ENTER THE VALUES 
//10
//--------------------
//SUM OF ARRAY IS : 17
