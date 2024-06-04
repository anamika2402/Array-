import java.io.*;
class program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int[] arr= new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int f=0;
		System.out.print("Enter the element :");
		int elem = Integer.parseInt(br.readLine());
		for(int i=0; i<arr.length; i++){
			if(arr[i]%elem==0){
				System.out.println(elem+" found at index "+i);
				f=0;
			}
			else{
				f=1;
			}
		}
		if(f==1){
			System.out.println("There is no multiple of "+elem+" in an array ");
		}
	}
}
			

