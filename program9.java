import java.io.*;
class program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
       
		System.out.println("Enter the specific element :");
		int num=Integer.parseInt(br.readLine());

		int size =0;
		int temp=num;
		while(num>0){
			num=num/10;
			size++;
		}
		int arr[] = new int[size];
		 
		for(int i=arr.length-1; i>=0; i--){
			int k=temp%10;
			arr[i]=k+1;
		
			temp=temp/10;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

