import java.io.*;
class program4{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		for(int i=0; i<arr.length; i++){
			int num=arr[i];
			int count=0;
			while(num>0){
				num=num/10;
				count++;
			}
			System.out.print(count+", ");
		}
	}
}
