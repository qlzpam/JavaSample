public class SystemDemo{
	public static void main(String[] args){
		// 현재 시간 정보 알아내기
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// 환경변수값 조회하기
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

	}
}