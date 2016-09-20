
public class StringExam {

	public static void main(String[] args) {
		// new 연산자 없이도 인스턴스를 만드는 것이 가능!
		String str1 = "hello";
		String str2 = "hello";
		// 이 경우에는 상수 영역에 hello가 있는지 찾아본다음, 참조
		
		String str3 = new String ("hello");
		String str4 = new String ("hello");
		//new 가 사용되었으므로, 기존에 상수 영역을 찾지 않고 새롭게 hello 변수를 만들고 참조
		
		//확인작업
		if (str1 == str2)
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		
		if (str1 == str3)
			System.out.println("str1과 str3은 같은 레퍼런스입니다.");
		
		if (str3 == str4)
			System.out.println("str3과 str4는 같은 레퍼런스입니다");
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		
	}

}
