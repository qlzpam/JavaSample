public class EmployeeApp{
	public static void main(String[] args){
		// 5명의 사원정보를 관리하기
		Employee[] employees = new Employee[3];

		//사원정보
		Employee emp1 = new Employee();
		emp1.no =23;
		emp1.name = "홍길동";

		//영업사원정보
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "이순신";
		emp2.goal = 50;
		emp2.result = 37;

		//개발부 사원 정보
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "김유신";
		emp3.todo = 10;
		emp3.completed = 4;

		// 배열에 사원정보 저장
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		//employees[0].print();
		//System.out.println();
		//employees[1].print();
		//System.out.println();
		//employees[2].print();

		for(Employee emp : employees){
			boolean value = emp instanceof Sales; // 해당 클래스(Sales) 타입의 객체인지 확인하는 실행문.
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