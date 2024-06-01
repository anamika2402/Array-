import java.io.*;
class program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int min=arr[0];
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The differnce between the minimum and maximim element in an array is "+(max-min));
	}
}


