public class MemberApp{
	public static void main(String[] args){
		// ȸ�� ������ ������� Member ��ü�� �����ϰ�
		Member m1 = new Member();
		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� ����Ÿ�� ��ü�� �����ϱ�
		m1.setName("�ƹ���");
		m1.setId("ID��");
		m1.setPassword("123123");
		m1.setAge(25);

		// ������ Member ��ü�� ����� ���� getter �Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.printf("�̸�: %s\n",m1.getName());
		System.out.printf("���̵�: %s\n",m1.getId());
		System.out.printf("����: %s\n",m1.getAge());
	}
}