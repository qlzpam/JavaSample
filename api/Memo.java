import java.util.*;
import java.io.*;
public class Memo{
	public static void main(String[] args) throws Exception {
		String text = "";
		text += "학교종이 땡땡땡\n";
		text +="어서모이자\n";
		text +="선생님이 우리를\n";
		text +="기다리신다.\n";

		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();

		// 프로그램 종료하기
		//System.exit(0);

		// 배열 복사하기
		String[] src = {"이순신","강감찬","김유신","홍길동","일지매","임꺽정"};

		String[] dest = new String[10];

		System.arraycopy(src, 2 , dest, 1 , 2); // 순서대로 소스배열명, 복사시작할위치, 복사할배열명, 복사할배열의 시작위치, 소스배열에서 가져올갯수
		System.out.println(Arrays.toString(dest));
	}
}