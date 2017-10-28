import java.util.Scanner;

public class ExactlyElectrical {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int electricity = sc.nextInt();
		int num5 = num1 - num3;
		int num6 = num2 - num4;
		num5 = Math.abs(num5);
		num6 = Math.abs(num6);
		if((num5 % 2 == 0 && num5 != 0 )||(num6 %2 == 0 && num6 != 0)){
			if(electricity % 2 ==0){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}
		}else{
			if(electricity % 2 !=0){
				System.out.println("Y");
			}else{
				System.out.println("N");
			}
		}
	}
}