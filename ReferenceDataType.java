
public class ReferenceDataType {

	public static void main(String[] args) {
		int i = 4;
		
		String str = new String("hello");
		//new = 클래스를 메모리에 올리겠다는 뜻
		//참조 = reference, 다른 메모리의 객체를 참조만 한다는 뜻! str은 string변수를 참조하는 상황
		
		System.out.println(i + str);
		
		
	}

}
