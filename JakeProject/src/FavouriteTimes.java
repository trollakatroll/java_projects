import java.text.SimpleDateFormat;
import java.util.*;

public class FavouriteTimes {
	static boolean isArithmeticSequence(String incomingString){
		boolean result = false;
		String firstNum = incomingString.substring(0, 1);
		String secondNum = incomingString.substring(1,2);
		boolean sameNums = false;
		boolean ok = incomingString.matches("^(\\d)\\1*$");
		if(ok){ return true; }
		int first = Integer.parseInt(firstNum);
		int second = Integer.parseInt(secondNum);
		int dif = second-first;
		int expectedNextNumber = second+dif;
		for(int i = 2; i<incomingString.length(); i++){
			
			int currentNum = Integer.parseInt(incomingString.substring(i,i+1));
			if(currentNum != expectedNextNumber){
				result = false;
				break;
			}else{
				expectedNextNumber = currentNum + dif;
				result = true;
			}
		}
		return result;
	}

	static String addMinutes(String startingHour, String startingMin, String min2Add) {
		String result = "";
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(startingHour));
		cal.set(Calendar.MINUTE, Integer.parseInt(startingMin));
		cal.add(Calendar.MINUTE, Integer.parseInt(min2Add));
		SimpleDateFormat format1 = new SimpleDateFormat("hhmm");
		result = format1.format(cal.getTime());
		return Integer.parseInt(result) + "";

	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String min = sc.nextLine();
		int num = Integer.parseInt(min);
		int counter = 0;
		boolean bool = false;
		for(int i = 0; i<=num; i++){
			String result = addMinutes("12", "00", min);
			bool = isArithmeticSequence(result);
			if(bool){
				counter ++;
			}else{
				
			}
			int hi = Integer.parseInt(min);
			hi = hi - 1;
			min = hi + "";
		}
		System.out.println(counter);
	}
}