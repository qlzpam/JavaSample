import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo1{
	public static void main(String[] args){
		try {
			//FileNotFoundException�� �߻���Ű�� ������.
		BufferedReader reader = new BufferedReader(new FileReader("memo1.txt"));
			//IOException �߻���Ű�� �޼ҵ�
		String text = reader.readLine();
		System.out.println("���� ����: " + text);

		} catch(FileNotFoundException fnfe){
			System.out.println("==���ܹ߻�==");
			System.out.println("���ܰ�ü: " +fnfe);
			fnfe.printStackTrace(); // ������ �����Ҽ��ִ� ������ ȭ�鼼 ������ִ� �޼ҵ�
			// ���� ó�� �ڵ� �ۼ�
			// 1. ����� ģȭ���� �����޼��� ���
			System.out.println("������ ã�� �� �����ϴ�. ��� �� ���ϸ��� Ȯ���ϼ���.");
		} catch(IOException ioe){
			System.out.println("������ �о���� ���� ������ �߻��Ͽ����ϴ�. ���ӻ��¸� Ȯ���ϼ���");
		}
	}
}