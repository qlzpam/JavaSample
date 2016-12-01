import java.io.*;
public class ExceptionDemo2{
	// reading()�� �ڽ��� ���ܸ� ó�������ʰ�
	// ȣ���ϴ��ʿ� ����ó���� �����Ѵ�.
	public static void reading() throws FileNotFoundException, IOException{
		// FileNotFoundException�� �߻��Ҽ��ִ� ������
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
		// IOException�� �߻��Ҽ��ִ� �޼ҵ�
		String text = reader.readLine();
		System.out.println("����: " + text);
	}
	// main() �޼ҵ�� reading() ȣ��� ���ӹ��� ���ܸ� ó���Ͽ���.
	public static void main(String[] args){
		try{
		ExceptionDemo2.reading();
		}catch(FileNotFoundException e){
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch(IOException e){
			System.out.println("������ �д� �� ������ �߻��Ͽ����ϴ�.");
		}
	}
}