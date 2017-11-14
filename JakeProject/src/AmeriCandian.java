import java.util.Scanner;

public class AmeriCandian {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if(str.equals("quit!")){
				break;
			}else{
				if(str.length()>=4){
					String last = str.substring(str.length()-3, str.length()-2);
					if(last.equals("a") || last.equals("e") || last.equals("i") || last.equals("o") || last.equals("u") || last.equals("y")){
						System.out.println(str);
					}else{
						String first = str.substring(0, str.length()-3);
						String completeStr = first+last+"our";
						System.out.println(completeStr);
					}
				}else{
					System.out.println(str);
				}
			}
		}
	}
}
