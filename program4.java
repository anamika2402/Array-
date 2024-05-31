import java.io.*;
class program4{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.print("Enter the elements :");
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				arr[i]=0;
			}
			else{
				arr[i]=1;
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}



