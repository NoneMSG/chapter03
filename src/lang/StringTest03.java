package lang;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "abcAbcabcAbc";
		//charAt
		System.out.println(s.charAt(2));
		
		//indexOf 검색
		System.out.println(s.indexOf("Abc"));
		System.out.println(s.indexOf("X"));
		
		//치환 replace
		System.out.println(s.replace('a', 'r'));
		System.out.println(s);
		
		//replaceAll
		System.out.println(s.replace("bc", "12"));
		System.out.println(s.replaceAll("bc", "12"));
		System.out.println(s.replaceFirst("bc", "12"));
		
		//subString 
		System.out.println(s.substring(3, 7));
		
		//toLowerCase
		System.out.println(s.toLowerCase());
		
		String str1 = " ab cd";
		String str2 = ",efg ";
		//concat 
		str1 = str1.concat(str2);
		System.out.println(str1);
		
		//trim 문자열 중간의 공백은 지워지지 않는다. replace로 (" ", "")처럼 제거가능
		//str1 = " ab cd,efg ";
		System.out.println("--"+str1+"--");
		str1 =str1.trim();
		System.out.println("--"+str1+"--");
		
		//split 매개변수(divider)를 경계로 분리 반환값은 절대 null이 안 나온다. 
		String[] tokens = str1.split(",");
		for(String str : tokens){
			System.out.println(str);
		}
		String[] temp = "".split(",");
		System.out.println(temp);

		//split의 예외      반환값이 없다면 빈문자가 들어간다 길이가 1이됨
		tokens = "abcdefg".split(",");
		for(String str: tokens){
			System.out.println(str);
		}
		tokens = "".split(",");
		System.out.println(tokens.length);
		
	}

}
