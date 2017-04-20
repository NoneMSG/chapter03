package lang;

public class WrapperClass02 {
	public static void main(String[] args){
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));
		//String은 내장함수로 문자나문자열이 숫자인지 찾을 수 없다.
		
		
		//정규표현식으로 문자열이 숫자가 맞는지 아닌지를 알아보고 파싱을 할지 안 할지 결정하도록 한다.
		String s = "123a4";
		if(s.matches("-?\\d+(\\.\\d+)?")==false){
			System.out.println("is not number");
		}else{
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		
		//프로그램 로직 (변수 검증...) try~catch 문으로 하지 말 것 try-catch를 오용하는 방식
		/*
		 * try{
		 * 	int i = Integer.parsInt(s);
		 * }catch(NumberFormatException ex){
		 * 		System.out.println("숫자가 아닙니다.");
		 * }
		 * */
		
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16") );
		System.out.println(Long.parseLong("123456789"));
		
		System.out.println(String.valueOf(12345));
	}
}
