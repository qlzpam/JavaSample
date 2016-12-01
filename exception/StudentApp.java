import java.io.*;
public class StudentApp{
	/*
	1.score.txt ������ �о� ȭ�鿡 ����ϱ�

 - �л���������� Student Ŭ���� ����
 - StudentApp ����
	FileReader�� BufferedReader�� ����ؼ� ���� �о����
	�о�³����� , �������� �ڸ���
	�߶� ������ Student��ü�� �����ؼ� �����ϱ�
	(������ ���ڷ� ��ȯ�ϱ�: int Integer.parseInt(����))
	Student��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
	*/
	public static void main(String[] args) throws Exception{
			BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
			String text = reader.readLine();
			String[] scores = text.split(",");
			Student stu = new Student(scores[0],scores[1],Integer.parseInt(scores[2]),Integer.parseInt(scores[3]),Integer.parseInt(scores[4]));

			System.out.println(stu.getName());
			System.out.println(stu.getGrade());
			System.out.println(stu.getKor());
			System.out.println(stu.getEng());
			System.out.println(stu.getMath());
	}
}