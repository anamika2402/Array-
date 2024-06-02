import java.io.*;
class program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		int f=0;
		for(int i=0; i<arr.length/2; i++){
			if(arr[i] == arr[size-1-i]){
				f=0;
			}
			else{
				f=1;
				break;
			}
		}
		if(f==1){
			System.out.println("Given array is not a pallindrome");
			
		}
		else{
			System.out.println("Given array is a pallindrome");
		}
	}
}

