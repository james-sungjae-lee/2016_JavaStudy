
public class ForEachExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarr = {10,20,30,40,50};
		//for 문의 경우 
		for(int i = 0; i < iarr.length; i++	){
			int value = iarr[i];
			System.out.println(value);
			
		}
		// for each의 경우 
		for (int value :iarr){
		System.out.println(value);
		}
		
	}

}
