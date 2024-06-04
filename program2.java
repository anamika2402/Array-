import java.io.*;
class program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr= new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		int sum=0;
	       	int count2=0;
		for(int i=0; i<arr.length; i++){
			int temp=1;
			int count=0;
			while(temp<=arr[i]){
				if(arr[i]%temp==0){
					count++;
				}
				temp++;
			}
			if(count==2){
				sum=sum+arr[i];
				count2++;
			}
				
		}
		System.out.println("The sum of all prime numbers is "+sum);
		System.out.println("The count of all prime numbers is "+count2);

	}
}

