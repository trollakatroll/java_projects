import java.util.Scanner;

public class NineNineSixSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long counter = 0;
		for(long i = a; i<b; i++){
			long in = i;
			String str = in+"";
			if(str.replace("1","") == ""){
				counter++;
			}
			if(str.replace("8","") == ""){
				counter++;
			}
			if(str.substring(0 , (int) (in/2)) == str.substring((int) (in/2) , str.length()) && str.replace("1", "").replace("8", "") == ""){
				counter++;
			}else if (str.replace("6", "").replace("9", "") == ""){
				
			}
		}
	}

}
