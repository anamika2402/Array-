import java.io.*;
class program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int max2=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>=max2 && arr[i]<max){
				max2=arr[i];
			}
		}
		System.out.println("The second maximum element in an array :"+max2);
	}
}
