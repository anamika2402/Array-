import java.util.*;
class program8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of an employees :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the age of every employee :");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println("The age of an "+i+" employee is "+arr[i]);

		}
	}
}




