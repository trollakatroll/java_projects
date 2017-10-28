import java.util.Scanner;

public class UpAndDown {
	public static void main(){
		Scanner sc = new Scanner(System.in);
		int nikky = 0;
		int byron = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		boolean toggle = true;
		int i = 0;
		while(toggle){
			i++;
			if(i%2!=0){
				if(s-a > 0){
					nikky = nikky + a;
				}else{
					nikky = nikky + s;
					break;
				}
			}else{
				if(s-b > 0){
					nikky = nikky - b;
				}else{
					nikky = nikky - s;
					break;
				}
			}
		}
		i = 0;
		while(toggle){
			i++;
			if(i%2!=0){
				if(s-c > 0){
					byron = byron + c;
				}else{
					byron = byron + s;
					break;
				}
			}else{
				if(s-d > 0){
					byron = byron - d;
				}else{
					byron = byron - s;
					break;
				}
			}
		}
		if(byron > nikky){
			System.out.println("Byron");
		}else if(nikky > byron){
			System.out.println("Nikky");
		}else{
			System.out.println("Tied");
		}
	}
}