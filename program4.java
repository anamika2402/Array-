/*WAP to search a specific element in an array and return its index .Ask the user to provide the number to search, also to take size and elements 
 * input from the user */
import java.io.*;
class program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int num;
		System.out.println("Enter the element to search :");
		num=Integer.parseInt(br.readLine());
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num){
				System.out.println(arr[i]+" found at index "+i);
			}
			else{
				System.out.println("Element not found" );
			}
		}
	}
}




