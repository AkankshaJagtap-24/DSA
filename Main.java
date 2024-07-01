/**
 * 
 */
package newDSAEclipse;
//import java.util.Scanner;

/**
 * 
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
//		
//		int n= sc.nextInt();
//		
//		int[] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
		//}
		
/// sum of array //
//		int sum = 0;
//		for(int i =0;i < n;i++) {
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//			
//		}
//		System.out.println(sum);
		
///Max of array
//		int max = Integer.MIN_VALUE;
//		for(int i =0; i < arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);		
//		
		
		
//// reverse of array ////
//		int i =0;
//		int j =n-1;
//		
//		while(i<j) {
//			//sawpping 
//			int temp = arr[i];
//			arr[i] =arr[j];
//			arr[j] = temp;
//			
//			i++;
//			j--;
//		}
//		for(int k=  0;k<n;k++) {
//			System.out.print(arr[k] + " ");
//		}
//		
//// SUBARRAYS OF ARRAY(subarray is a contiguous part of an array )
		
//		for(int si=0;si<n;si++) {
//			for(int ei=si;ei<n;ei++) {
//				for(int k=si;k<=ei;k++) {
//					System.out.print(arr[k] + " ");
//				}
//				System.out.println();
//			}
//		}

		
/// 2D arrays 
		//int[][] arr = new int[][];
//		// row count 
//		System.out.println(arr.length);
//		//col count 
//		System.out.println(arr[0].length);
//		///traversal
//		for(int i =0;i<ar.length;i++) {
//			for(int j = 0;j< arr[0].length;j++) {
//				//process
//			}
//		}
		 
//// Transpose of matrix (diagonal elements are same but below and above elements will be swap with each others place)
//				int[][] arr = {{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16}};
//		
//		// lower triangle of maatrix --> swap((i,j)--> (j,i))
		
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<i;j++) {
//				int temp = arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//				
//			}
//		}
//		for(int i =0;i<arr.length;i++) {
//			for(int j= 0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		 	

// ROTATE 2D ARRAY CLOCKWISE 90 degree
		
		//rowwise reverse  
//		for(int i=0;i<arr.length;i++) {
//			int left =0;
//			int right =arr[i].length-1;
//			while(left< right) {
//				int temp = arr[i][left];
//				arr[i][left]= arr[i][right];
//				arr[i][right]=temp;
//				right++;
//				left--;
//			}
//			System.out.print(arr[i]+ " ");
//			
//		}
//     
		
//		int[] arr = new int[4];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=sc.nextInt();
//		}
//				
//		System.out.print(Arrays.toString(arr));
		System.out.print("hello");
		
		
	}

}
