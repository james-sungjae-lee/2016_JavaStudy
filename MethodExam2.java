
public class MethodExam2 {

	public static void main(String[] args) {
		
		MethodExam methodExam = new MethodExam();
		
		methodExam.method1();
		
		methodExam.method2(10);
		
		int value = methodExam.method3();
		System.out.println("m3�� ���ϵ� �� " + value);
		
		methodExam.method4(5, 10);
		
		int value2 = methodExam.method5(55);
		System.out.println("m5�� ������ �� " + value2); 
		
	}

}
