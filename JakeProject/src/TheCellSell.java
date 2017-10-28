import java.util.Scanner;

public class TheCellSell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int evening = sc.nextInt();
		int weekend = sc.nextInt();
		double pA = 0;
		double pB = 0;
		int ACalc = day - 100;
		int BCalc = day - 250;
		if (ACalc > 0) {
			for (int i = 0; i < ACalc; i++) {
				pA = pA + 0.25;
			}
		} else if (BCalc > 0) {
			for (int i = 0; i < BCalc; i++) {
				pB = pB + 0.45;
			}
		}
		if(evening > 0){
			for(int i = 0; i < evening; i++){
				pA = pA + 0.15;
				pB = pB + 0.35;
			}
		}
		if(weekend > 0){
			for(int i = 0; i < weekend; i++){
				pA = pA + 0.2;
				pB = pB + 0.25;
			}
		}
		System.out.println("Plan A costs " + pA);
		System.out.println("Plan B costs " + pB);
		if(pB > pA){
			System.out.println("Plan B is cheapest");
		}else{
			System.out.println("Plan A is cheapest");
		}
	}

}
