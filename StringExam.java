
public class StringExam {

	public static void main(String[] args) {
		// new ������ ���̵� �ν��Ͻ��� ����� ���� ����!
		String str1 = "hello";
		String str2 = "hello";
		// �� ��쿡�� ��� ������ hello�� �ִ��� ã�ƺ�����, ����
		
		String str3 = new String ("hello");
		String str4 = new String ("hello");
		//new �� ���Ǿ����Ƿ�, ������ ��� ������ ã�� �ʰ� ���Ӱ� hello ������ ����� ����
		
		//Ȯ���۾�
		if (str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		
		if (str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		
		if (str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�");
		
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		
	}

}
