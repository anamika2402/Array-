import java.util.*;
class program9{
	public static void main(String[] args){
	
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of an array :");
                int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(i%2!=0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
			
