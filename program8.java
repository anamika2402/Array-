import java.io.*;
class program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<=min){
				min=arr[i];
			}
		}
		int min2=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<=min2 && arr[i]>min){
				min2=arr[i];
			}
		}
		System.out.println("The second smallest element is "+min2);
	}
}

