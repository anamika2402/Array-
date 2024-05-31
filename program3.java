import java.io.*;
class program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.print("Enter the elements :");
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the specific element :");
		int elem = Integer.parseInt(br.readLine());
		int count = 0;
		int f=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==elem){
				count++;
			}
		}
		

		System.out.println("Number "+elem+" occured "+count+" times in an array ");
	}
}

