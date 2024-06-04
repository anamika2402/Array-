import java.io.*;
class program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int arr1[] = new int[size];
		System.out.print("Enter the elements of first array :");
		for(int i=0; i<arr1.length; i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		int arr2[]=new int[size];
		System.out.print("Enter the elements of second array :");

		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr2[j]==arr1[i]){
					System.out.print(arr1[i]+" ");
					break;
				}
			}
			
		}
	}
}

			
			
		
		

			



			

