
import java.io.*;
class program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                int[] arr=new int[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                for(int i=0; i<arr.length; i++){
                         int temp=arr[i];

                        int count=0;
                        while(temp>=1){
                                if(arr[i]%temp==0){
                                        count++;
                                }
                                temp--;
                        }
                        if(count>2){
                                System.out.print(arr[i]+" ");
                        }
                }
        }
}
