import java.io.*;
class program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
              
	     	}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.print((char)arr[i]+" ");
			}
			else{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
