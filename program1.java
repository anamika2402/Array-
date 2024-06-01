import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
		}
		double avg=sum/size;
		System.out.print("The average of given array is "+avg);
	}
}

	

