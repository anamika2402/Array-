
import java.util.Scanner;
class program2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
                int arr[] = new int[size];
                for(int i=0; i<size; i++){
                        System.out.print("Enter "+(i+1)+" element :");
                         arr[i] = sc.nextInt();
                }
                for(int i=0; i<size; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}
	

