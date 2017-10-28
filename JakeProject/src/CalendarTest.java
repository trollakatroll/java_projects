import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, sc.nextInt());
		cal.set(Calendar.MONTH, sc.nextInt()-1);
		cal.set(Calendar.DATE, sc.nextInt());
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(doy);

	}

}
