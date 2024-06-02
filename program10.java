import java.io.*;
class program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		for(int i=0; i<arr.length; i++){
			int fact=1;
			for(int j=1; j<=arr[i]; j++){
				fact=  fact*j;
			}
			System.out.print(fact+" ");

		}
	}
}
		
