import java.io.*;
class program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char[] arr=new char[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)(br.read());
                        br.skip(1);
                }
		System.out.print("Enter the element before which we have to stop:");
		char elem = (char)(br.read());
		for(int i=0; i<arr.length; i++){
			if(arr[i]==elem){
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}
}

