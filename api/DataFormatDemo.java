import java.text.SimpleDateFormat;
import java.util.Date;
public class DataFormatDemo{
	public static void main(String[] args)	{
		Date now = new Date();
		//String pattern = "yyyy.MM.dd"; //���. 2016.11.29
		//String pattern = "yy�� M�� d�� E"; //���. 16�� 11�� 29�� ȭ
		String pattern = "a h�� m�� s��"; //���. ���� 4�� 26�� 10��
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);
	}
}