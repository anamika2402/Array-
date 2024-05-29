import java.util.*;
class program3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				System.out.println(arr[i]+" ");
			}
		}
	}
}

