
public class MethodExam {
//	public ����Ÿ�� �޼ҵ� (�Ű�������) {���� ����}
	
	// �ƹ� �͵� ��, ������� ���� 
	public void method1 (){ 
		System.out.println("m1�� �����..");
	}
	// �� ���� ������ �Է� 
	public void method2 (int x){
		System.out.println("m2�� ����");
	}
	// �� ���� ������ ��� 
	public int method3 (){
		System.out.println("m3�� ����");
		return 10;
	}
	//�� ���� ������ �Է� 
	public void method4 (int x, int y){
		System.out.println(x + y + "m4�� ����");
	}
	//������ �Էµǰ� ���
	public int method5 (int y){
		System.out.println(y + "�̿��� m5 ��");
		return y*2;
	}
}
