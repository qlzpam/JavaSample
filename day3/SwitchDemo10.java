public class SwitchDemo10 {
	public static void main(String[] args) {
		
		String grade = "Silver";

		switch(grade) {
			case "Gold" :
				System.out.println("����� ����, ȯ���մϴ�.");
				break;
			case "Silver" :
				System.out.println("�ǹ���� ����, ȯ���մϴ�.");
				break;
			case "Bronze" :
				System.out.println("������� ����, ȯ���մϴ�.");
				break;
			default:
				System.out.println("����, ȯ���մϴ�.");

		}
	}
}