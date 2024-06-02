import java.io.*;
class program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		int evensum=0;
		int oddsum=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				evensum+=arr[i];
			}
			else{
				oddsum+=arr[i];
			}
		}
		System.out.println("The count of even numbers in an array :"+evensum);
		System.out.println("The count of odd numbers in an array :"+oddsum);
	}
}

