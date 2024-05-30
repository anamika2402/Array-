import java.io.*;
class program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements :");
		int sum=0;
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%3==0){
				sum=sum+arr[i];
			}
		}
		System.out.println("The sum of numbers divisible by 3 is :"+sum);
	}
}





