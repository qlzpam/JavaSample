public class Demo2 {
	public static void main(String[] args) {
		
		// ������ 3�� �̳��̰�,������ 4.3�� �̻��� ��� ���б� ����
		int ranking = 4;
		double score = 4.4;

		boolean result = (ranking <= 3 && score >= 4.3); 
		System.out.println("�������: " + result);

		// ��ü ���űݾ��� 50���� �̻��̰ų� 
		// ���� ǰ�� �ϳ��� �ݾ��� 20���� �̻��� ��� ��ǰ�� ����

		int price1= 15;
		int price2 = 35;
		int price3 = 3;

		int totalPrice = price1 +price2 +price3;

		boolean result2 = totalPrice >= 50 
						|| price1 >= 20 || price2 >= 20 || price3 >= 20;
		System.out.println("�������:" + result2);
		
	}
}