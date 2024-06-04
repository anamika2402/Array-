import java.io.*;
class program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the array1 size :");
		int size1=Integer.parseInt(br.readLine());
		int[] arr1=new int[size1];
		for(int i=0; i<arr1.length; i++){
			arr1[i]= Integer.parseInt(br.readLine());
		}

		System.out.print("Enter the array2 size :");
		int size2=Integer.parseInt(br.readLine());
		int[] arr2=new int[size2];
	
		int[] arr3=new int[size1+size2];
		int index=0;
		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr1.length; i++){
			arr3[index]=arr1[i];
			index++;
		}
		for(int i=0; i<arr2.length; i++){
			
			arr3[index]=arr2[i];
			index++;
			
		}
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
	}
}
		




