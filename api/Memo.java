import java.util.*;
import java.io.*;
public class Memo{
	public static void main(String[] args) throws Exception {
		String text = "";
		text += "�б����� ������\n";
		text +="�������\n";
		text +="�������� �츮��\n";
		text +="��ٸ��Ŵ�.\n";

		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();

		// ���α׷� �����ϱ�
		//System.exit(0);

		// �迭 �����ϱ�
		String[] src = {"�̼���","������","������","ȫ�浿","������","�Ӳ���"};

		String[] dest = new String[10];

		System.arraycopy(src, 2 , dest, 1 , 2); // ������� �ҽ��迭��, �����������ġ, �����ҹ迭��, �����ҹ迭�� ������ġ, �ҽ��迭���� �����ð���
		System.out.println(Arrays.toString(dest));
	}
}