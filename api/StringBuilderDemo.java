public class StringBuilderDemo{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("�߾�hta�п�");
		sb.append("���԰��� �ȳ�\n");
		sb.append("�������� ǥ�� �����ӿ�ũ ����,");
		sb.append("����Ʈ���� �������α׷� �����ڰ���\n");
		sb.append("�����Ⱓ(��): ");
		sb.append(120);

		String text = sb.toString();
		System.out.println(text);
	}
}