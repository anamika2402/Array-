import java.io.*;
class program5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		int i=0; 
		int f=0;
		for(;i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]==arr[i]){
					f=1;
					break;
				}
			}
			if(f==1){
				break;
			}
		}
		System.out.println("Duplicate element found at index "+i);
	}
}

