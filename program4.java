import java.io.*;
class program4{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.print("Enter the element :");
		int num=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num){
				cnt++;
			}
		}
		if(cnt>=2){
			System.out.println(num+" occured more than or equal to 2 times ");
		}
		else{
			System.out.println(num+" not occured more than or equal to 2 times ");
		}
			
	}
}

