import java.io.*;
class program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char[] arr= new char[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)(br.read());
			br.skip(1);
                }
		System.out.println("Array before Reversing :");
		for(int i=0; i<arr.length; ){
			System.out.print(arr[i]+" ");
			i+=2;
		}
		for(int i=0; i<arr.length/2; i++){
			char temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		System.out.print("Array after reversing :");
		for(int i=0; i<arr.length;){
			System.out.print(arr[i]+" ");
			i+=2;
		}
	}
}

