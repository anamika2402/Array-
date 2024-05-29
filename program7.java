import java.util.Scanner;
class program7{
	public static void main(String[] args){
		
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of an array :");
                int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.print("Enter the elements :");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%4==0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
