import java.io.*;
class program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int count=0;
		for(int i=0;i<arr.length; i++){
			int num=arr[i];
			int var=0;
			while(num>0){
				int rem=num%10;
				var=var*10+rem;
				num=num/10;
			}
			if(arr[i]==var){
				count++;
			}
		}
		System.out.println("The count of pallindrome number in an array is "+count);
	}
}

