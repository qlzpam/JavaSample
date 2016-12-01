import java.util.*;
public class CalendarDemo2{
	public static void main(String[] args)	{
		// Date ---> Calendar
		Date date = new Date();
		// 그 날짜에 해당하는 밀리세컨드 값 반환
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		// 밀리세컨드값에 해당하는 Calendar 값으로 변경
		cal.setTimeInMillis(time);

		// Calendar ---> Date
		// Calendar 객체의 날짜에 해당하는 Date객체가 반환된다.
		Date date2 = cal.getTime();
	}
}