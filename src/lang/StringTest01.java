package lang;

public class StringTest01 {

	public static void main(String[] args) {
		
		//문자 "esacpe
		String s = "I say \"hello\" ";
		System.out.println(s);
		
		//문자 'escape
		char c = '\'';
		System.out.println(c);
		
		//문자 \ escape
		String s1 = "C:\\js372";
		System.out.println(s1);
		
		// \t, \n, \r control 문자들
		System.out.print("\\n");
		//System.out.println("");
		
		// +연산이 가능하다.
		String s2 = "hello" +"world";
		System.out.println(s2);
		System.out.println(s2.charAt(4));
		
		//내부 문자(배)열을 가져오기
		char[] cs = s2.toCharArray();
		System.out.println(cs);
	}

}
