import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int [] arr = new int[size];
		System.out.print("Enter the elements :");
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());

		}
		for(int i=0; i<arr.length; i++){
			arr[i]=arr[i]+15;
			System.out.print(arr[i]+" ");
		}
	}
}


