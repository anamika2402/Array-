/*WAP to count even numbers in an array where you have to take the size and elements from the user and also print the even numbers too*/

import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int count=0;
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element :");

			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				count++;
				System.out.print(arr[i]+" ");
				System.out.println();
			}
		}
		System.out.println("Count of even numbers is :"+count);
	}
}




		

