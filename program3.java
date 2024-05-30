/*WAP to check if there is any vowel in the array of characters if present then print its index, where you have to take the size and elements from the user
 * */
/*import java.util.*;
class program3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		char  ch[] = new char[size];
		System.out.print("The elements of an array :");
		for(int i=0; i<ch.length; i++){
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='a' || ch[i]=='A' ||ch[i]=='E'||ch[i]=='e'||ch[i]=='I'||ch[i]=='i'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
				System.out.println("Vowel "+ch[i]+" is present at index "+i);
			}
		}
	}
}*/
import java.io.*;
class program3{
        public static void main(String[] args)throws IOException{
                BufferedReader be = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of an array :");
                int size = Integer.parseInt(be.readLine());
                char  ch[] = new char[size];
                System.out.print("The elements of an array :");
                for(int i=0; i<ch.length; i++){
                        ch[i]=(char)be.read();
			be.skip(1);
                }
                for(int i=0; i<ch.length; i++){
                        if(ch[i]=='a' || ch[i]=='A' ||ch[i]=='E'||ch[i]=='e'||ch[i]=='I'||ch[i]=='i'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
                                System.out.println("Vowel "+ch[i]+" is present at index "+i);
				
                        }
                }
        }
}	

