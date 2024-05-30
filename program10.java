/* WAP to print the maximum element in an array */
import java.io.*;
class program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements :");

		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("The maximum element in an array is "+max);
	}
}

			
