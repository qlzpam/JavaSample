public class ForDemo6 {
	public static void main(String[] args) {
		
		// 1~100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���

		int total = 0;
		int number =0;

		for (int a=1; a<=100; a++) {
			total +=a;
			if (total >= 3000) {
				number = a;
				break;
			}
			
		}
		System.out.println(number);
	}
}
/*
	int total = 0;
	int a = 1;

	for (; a<=100; a++) {
		total +=a;
		if (total >= 3000) {
			break;
		}
	}
*/