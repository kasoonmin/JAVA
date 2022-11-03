package sec40.exam40;

public class StringConvertExample {

	public static void main(String[] args) {
		
		// 문자열을 기본 타입값으로 변환
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		
		//기본 타입값을 문자열로 변환
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		
		System.out.println(intData1);
		System.out.println(strData2);

	}

}
