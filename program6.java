
/*WAP to print the product of odd indexed Elements,in the array where you have to take size input and elements input from the user */ 

import java.io.*;
class program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of an array :");
		int size = Integer.parseInt(br.readLine());
		int[] arr=new int[size];
		System.out.println("Enter the elements :");
		int prod=1;
		for(int i=0;i<arr.length; i++){
			arr[i]= Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			if(i%2!=0){
				prod=prod*arr[i];
			}
		}
		System.out.println("The product of odd elements is "+prod);
	}
}



