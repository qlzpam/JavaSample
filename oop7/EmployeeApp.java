public class EmployeeApp{
	public static void main(String[] args){
		// 5���� ��������� �����ϱ�
		Employee[] employees = new Employee[3];

		//�������
		Employee emp1 = new Employee();
		emp1.no =23;
		emp1.name = "ȫ�浿";

		//�����������
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "�̼���";
		emp2.goal = 50;
		emp2.result = 37;

		//���ߺ� ��� ����
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "������";
		emp3.todo = 10;
		emp3.completed = 4;

		// �迭�� ������� ����
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		//employees[0].print();
		//System.out.println();
		//employees[1].print();
		//System.out.println();
		//employees[2].print();

		for(Employee emp : employees){
			boolean value = emp instanceof Sales; // �ش� Ŭ����(Sales) Ÿ���� ��ü���� Ȯ���ϴ� ���๮.
			System.out.println(value);
		}

		for(Employee emp : employees){
			if(emp instanceof Sales){
				((Sales) emp).drawGraph();
			} else if (emp instanceof Developer){
				((Developer) emp).develop();
			}
		}
	}
}