import java.util.Date;
import java.util.Calendar;
public class CalendarDemo{
	public static void main(String[] args){
		Calendar now = Calendar.getInstance();
		//System.out.println(now);
		long nowTime = now.getTimeInMillis();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		//System.out.printf("%d�� %d�� %d�� \n", year, month, day);

		Calendar birth = Calendar.getInstance();
		birth.set(1991,6,16);
		long birthTime = birth.getTimeInMillis();
		//System.out.println(birth);

		long lifeTime = (nowTime - birthTime)/1000;
		System.out.println("��: " + lifeTime);
		System.out.println("��: " + lifeTime/60);
		System.out.println("�ð�: " + lifeTime/(60*60));
		System.out.println("��: " + lifeTime/(60*60*24));
	}
}