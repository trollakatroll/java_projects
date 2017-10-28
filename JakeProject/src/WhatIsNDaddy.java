import java.util.*;

public class WhatIsNDaddy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		double num = sc.nextInt();
		int num2 = 0;;
		double oldNum = num;
		while(num != 0){
			num--;
			num2++;
			if(num == num2){
				counter++;
				break;
			}else if(num2 == oldNum){
				break;
			}else{
				counter++;
				oldNum = num;
			}
		}
		System.out.println(counter);
	}

}