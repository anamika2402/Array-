import java.util.*;
class program10{
	public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of an array :");
                int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the exam seat number of a students :");
		for(int i=0; i<arr.length; i++){
			 arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println("The seat number of "+i+" student is "+arr[i]);
		}
	}
}
		
