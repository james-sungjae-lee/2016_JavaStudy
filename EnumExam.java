
public class EnumExam {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main (String[] args){
		String gender1;
		
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy"; // male, female 이외에도 ok라 문제임
		
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
//		gender3 = Gender.BOY; // 특정 값 이외에는 불가!! 
		
	}

}
enum Gender{
	MALE, FEMALE;
}
