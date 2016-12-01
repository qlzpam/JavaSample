import java.text.SimpleDateFormat;
import java.util.Date;
public class DataFormatDemo{
	public static void main(String[] args)	{
		Date now = new Date();
		//String pattern = "yyyy.MM.dd"; //결과. 2016.11.29
		//String pattern = "yy년 M월 d일 E"; //결과. 16년 11월 29일 화
		String pattern = "a h시 m분 s초"; //결과. 오후 4시 26분 10초
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);
	}
}