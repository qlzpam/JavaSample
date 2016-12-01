import java.io.*;
public class StudentApp{
	/*
	1.score.txt 파일을 읽어 화면에 출력하기

 - 학생정보를담는 Student 클래스 정의
 - StudentApp 정의
	FileReader와 BufferedReader를 사용해서 파일 읽어오기
	읽어온내용을 , 기준으로 자르기
	잘라낸 내용을 Student객체를 생성해서 저장하기
	(점수는 숫자로 변환하기: int Integer.parseInt(글자))
	Student객체에 저장된 내용을 화면에 표시하기
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