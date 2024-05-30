import java.io.*;
class program8{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i]+" is greater then 5 but less than 9");
			}
		}
	}
}




