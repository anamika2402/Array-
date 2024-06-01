import java.io.*;
class program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the size of an array :");
                int size = Integer.parseInt(br.readLine());
                char[] arr=new char[size];
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)(br.read());
			br.skip(1);
		}
		int vcount=0;
		int ccount=0;

		for(int i=0; i<arr.length; i++){
			if(arr[i]=='A' || arr[i]=='a' || arr[i]=='E' || arr[i]=='e' || arr[i]=='O' ||arr[i]=='o' ||arr[i]=='U' ||arr[i]=='u'||arr[i]=='E' ||arr[i]=='i'){
			vcount++;
			}
			else{
				ccount++;
			}
		}
		System.out.println("The count of vowel in an array is "+vcount);
		System.out.println("The count of consonants in an array is "+ccount);
	}
}
