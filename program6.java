import java.io.*;
class program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char [] arr = new char[size];
                System.out.print("Enter the elements :");
                for(int i=0; i<arr.length; i++){
                        arr[i] = (char)(br.read());
			br.skip(1);
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]!='a'&& arr[i]!='A'&& arr[i]!='E'&& arr[i]!='e'&& arr[i]!='I'&& arr[i]!='i'&& arr[i]!='O' && arr[i]!='o'&& arr[i]!='U'&& arr[i]!='u'){
				System.out.print(arr[i]+" ");
			}
		}
	}
}


