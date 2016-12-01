public class StudentApp{
	public static void main(String[] args){
		StudentService service = new StudentService();

		Student student1 = service.getStudentByNo(25);
		Student[] student2 = service.getStudentsByGrade(3);
		System.out.println(student1);
		System.out.println(student2[0].getName());
	}
}