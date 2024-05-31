import java.io.*;
class program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.print("Enter the elements :");
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0 ;i<arr.length; i++){
			if(arr.length%2!=0 && arr.length>=5){
				if(i%2!=0){
					System.out.print(arr[i]+" ");
				}
			}
			else{
				if(i%2==0){

					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}


