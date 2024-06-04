import java.io.*;
class program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int max=arr[0];
		int max2=arr[1];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=1; i<arr.length; i++){
			if(arr[i]>=max2 && arr[i]<max){
				max2=arr[i];
			}
		}
		int max3=arr[1];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>=max3 && arr[i]<max2){
				max3=arr[i];
			}
		}
		System.out.println("The third largest element in an array is "+max3);
	}
}

