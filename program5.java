import java.io.*;
class program5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		for(int i=0; i<arr.length/2; i++){
			int temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

