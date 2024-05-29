
import java.util.Scanner;
class program1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		for(int i=0; i<10; i++){
			System.out.print("Enter "+i+" element :");
			 arr[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+" ");
		}
	}
}


