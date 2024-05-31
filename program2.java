import java.io.*;
class program2{
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
		int num = Integer.parseInt(br.readLine());
		int i=0;
		for(;i<arr.length; i++){
			if(arr[i]==num){
				break;
			}
			
		}
		System.out.println("The element "+num+" is found ata index "+i);
	}
}

