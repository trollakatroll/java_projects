import java.util.Scanner;

public class TheCellSell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float day = sc.nextInt();
		float evening = sc.nextInt();
		float weekend = sc.nextInt();
		double planACost = 0;
		double planBCost = 0;
		if(day>100){
			float planADay = day-100;
			planACost = planACost + (planADay*0.25);
		}
		if(day>250){
			float planBDay = day-250;
			planBCost = planBCost + (planBDay*0.45);
		}
		planACost = planACost + (evening*0.15);
		planBCost = planBCost + (evening*0.35);
		planACost = planACost + (weekend*0.20);
		planBCost = planBCost + (weekend*0.25);
		String A = planACost + "";
		String B = planBCost + "";
		String Afront = A.substring(0, 2);
		planACost = Math.round(planACost);
		planBCost = Math.round(planBCost);
		System.out.println("Plan A costs " + planACost);
		System.out.println("Plan B costs " + planBCost);
		if(planACost>planBCost){
			System.out.println("Plan B is cheapest.");
		}else if(planACost<planBCost){
			System.out.println("Plan A is cheapest.");
		}else{
			System.out.println("Plan A and B are the same price.");
		}
	}

}
