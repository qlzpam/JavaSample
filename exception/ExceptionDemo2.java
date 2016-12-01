import java.io.*;
public class ExceptionDemo2{
	// reading()은 자신이 예외를 처리하지않고
	// 호출하는쪽에 예외처리를 위임한다.
	public static void reading() throws FileNotFoundException, IOException{
		// FileNotFoundException이 발생할수있는 생성자
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
		// IOException이 발생할수있는 메소드
		String text = reader.readLine();
		System.out.println("내용: " + text);
	}
	// main() 메소드는 reading() 호출시 위임받은 예외를 처리하였다.
	public static void main(String[] args){
		try{
		ExceptionDemo2.reading();
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e){
			System.out.println("파일을 읽는 중 오류가 발생하였습니다.");
		}
	}
}