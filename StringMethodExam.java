
public class StringMethodExam {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());//������ ���̸� �˷���
		System.out.println(str.concat(" World")); // ���ڿ��� �߰���
		System.out.println(str);// Ư¡ : Hello World�� �ƴ� Hello�� ��Ÿ�� - ���� : concat�� ���� ���۷����� �������� �ʱ� ������
		
		str = str.concat(" World2"); // �̷��� = �� �ٿ���� str�� �ؽ�Ʈ�� �߰��� ������ ����ȴ� 
		System.out.println(str);
		
		System.out.println(str.substring(3));// �տ��� n��° ���ں��� ���  	
		
		System.out.println(str.substring(2, 7)); // n��°���� m��°���� ��� 
		
		
	}

}
