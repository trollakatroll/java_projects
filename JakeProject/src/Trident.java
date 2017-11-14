import java.util.Scanner;

public class Trident {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sticks = sc.nextInt();
		int spaces = sc.nextInt();
		int bottom = sc.nextInt();
		int base = spaces*spaces;
		for(int i = 0; i<sticks; i++){
			for(int k = 0; k<spaces; k++){
				System.out.print("*");
				if(k!=spaces-1){
					for(int j = 0; j<spaces; j++){
						System.out.print(" ");
					}
				}
				if(k==spaces-1){
					System.out.println();
				}
			}
		}
		for(int i = 0; i<base; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i<bottom; i++){
			for(int j = 0; j<base/2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			if(i!=bottom-1){
				System.out.println();
			}
		}
	}
}
