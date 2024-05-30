/* WAP to print the sum of odd indexed elements,in an array where you have to take the size input and elements input from the user */

import java.io.*;
class program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<arr.length; i++){
			 arr[i] = Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0; i<arr.length; i++){
			if(i%2!=0){
				sum =sum+arr[i];
			}
		}
		System.out.println("The sum of an element is "+sum);
	}
}
				
		











				

