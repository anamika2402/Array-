

 /* WAP to print the array,if the user given size of an array is even then print the alternate elements in an array ,else print whole array*/ 
import java.io.*;
class program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the element of an array :");
		for(int i=0; i<arr.length; i++){
			 arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length;){
			if((arr.length)%2==0){
				System.out.print(arr[i]+" ");
				i=i+2;
			}
			if(arr.length%2!=0){
				System.out.print(arr[i]+" ");
				i++;
			}
		}
	}
}




