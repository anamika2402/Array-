import java.io.*;
class program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		int prod=1;
                for(int i=0; i<arr.length; i++){
                         int temp=arr[i];

                        int count=0;
                        while(temp>=1){
                                if(arr[i]%temp==0){
                                        count++;
                                }
                                temp--;
                        }
                        if(count==2){
                        	prod=prod*arr[i];        
                        }
                }
		System.out.println("The product all prime numbers in an array is :"+prod);
        }
}
