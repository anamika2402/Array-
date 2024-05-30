/* WAP to print minimum element in an array, where you have to the element and size from the user */
import java.io.*;
class program9{
	public static void main(String[] argfs)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int min=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The minimum element in an array is "+min);
	}
}
