public class Quizz6{
	public static class Employee{
		private String name;
		private String dept;
		private String pos;
		private int salary;

		public Employee(){}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getDept(){
			return dept;
		}
		public void setDept(String dept){
			this.dept = dept;
		}
		public String getPos(){
			return pos;
		}
		public void setPos(String pos){
			this.pos = pos;
		}
		public int getSalary(){
			return salary;
		}
		public void setSalary(int salary){
			this.salary = salary;
		}
	}
	public static void main(String[] args){
		/*
		�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
		(�ʵ�����,�⺻������, ����/����)

		2.^�� �������� ���ڿ� �߶� �迭�� ���

		3.�迭�� ��������� �ϳ��� �����ؼ� , �� �߶� �迭�� ���
		4. Employee ��ü�� ���� ��������� �� �����͸� Employee ��ü�� �����ϱ�
		5. Employee ��ü�� employee �迭�� �����ϱ�
		6. Employee �迭�� ����� ���� ����ϱ�
		*/

		Employee[] employees = new Employee[4];

		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";

		String[] arr = text.split("\\^");
		for(int i=0; i<arr.length; i++) {
			String item = arr[i];
			String[] values = item.split(",");

			Employee emp = new Employee();
			emp.setName(values[0]);
			emp.setDept(values[1]);
			emp.setPos(values[2]);
			int salary = Integer.parseInt(values[3]); // ���ڸ� ���������� ��ȯ
			emp.setSalary(salary);

			employees[i] = emp;
		}

		for(Employee emp : employees){
			System.out.printf("%s %s %s %d\n", emp.getName(), emp.getDept(), emp.getPos(), emp.getSalary());
		}
	}
}