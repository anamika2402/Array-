import java.io.*;
class program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char[] arr=new char[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)(br.read());
                        br.skip(1);
                }
		System.out.println("Enter the element in an array :");
		char elem=(char)(br.read());
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==elem){
				count++;
			}
		}
		System.out.println(elem+" occured "+count+" times in an array ");
	}
}
