
public class StringMethodExam {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());//문자의 길이를 알려줌
		System.out.println(str.concat(" World")); // 문자열을 추가함
		System.out.println(str);// 특징 : Hello World가 아닌 Hello만 나타남 - 이유 : concat이 기존 레퍼런스를 변경하진 않기 때문이
		
		str = str.concat(" World2"); // 이렇게 = 을 붙여줘야 str에 텍스트가 추가된 사항이 저장된다 
		System.out.println(str);
		
		System.out.println(str.substring(3));// 앞에서 n번째 글자부터 출력  	
		
		System.out.println(str.substring(2, 7)); // n번째부터 m번째까지 출력 
		
		
	}

}
