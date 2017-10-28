import java.util.*;

public class HappyOrSad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean toggle = false;
		int counter1 = 0;
		int counter2 = 0;
		while(!toggle){
					if(a.contains(":-)")){
						counter1++;
						a.replace(":-)", "");
					}else if(a.contains(":-(")){
						counter2++;
						a.replace(":-(", "");
					}else{
						toggle = true;
					}
		}
		if(counter1 == 0 && counter2 == 0){
			System.out.println("none");
		}else if(counter1 > counter2){
			System.out.println("happy");
		}else{
			System.out.println("sad");
		}
	}

}
