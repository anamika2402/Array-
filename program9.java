import java.io.*;
class program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char[] arr=new char[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)(br.read());
                        br.skip(1);
                }
		for(int i=0; i<arr.length; i++){
			if(arr[i]>=97 && arr[i]<=122){
				arr[i]=arr[i];
			}
			else{
				arr[i]='#';
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
