
public class MethodExam {
//	public 리턴타입 메소드 (매개변수들) {구현 내용}
	
	// 아무 것도 입, 출력하지 않음 
	public void method1 (){ 
		System.out.println("m1이 실행됨..");
	}
	// 한 개의 변수만 입력 
	public void method2 (int x){
		System.out.println("m2가 실행");
	}
	// 한 개의 변수만 출력 
	public int method3 (){
		System.out.println("m3를 실행");
		return 10;
	}
	//두 개의 변수만 입력 
	public void method4 (int x, int y){
		System.out.println(x + y + "m4를 실행");
	}
	//변수가 입력되고 출력
	public int method5 (int y){
		System.out.println(y + "이용한 m5 실");
		return y*2;
	}
}
