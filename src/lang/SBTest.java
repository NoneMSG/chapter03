package lang;

public class SBTest {

	public static void main(String[] args) {
		//생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		//문자열 추가
		sb.append(" is pencil");
		System.out.println(sb);
		
		//삽입
		sb.insert(7," my");
		System.out.println(sb);
		
		//치환
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		//버퍼 크기 조정
		sb.setLength(3);
		System.out.println(sb);
		
		//더 중요한 내용
		//문 자열 + 연산은 내부적으로 StringBuffer 객체로 변환 된다.
		String s1 ="Hello"+"world"+10+true;
		String s2 = new StringBuffer("Hello").
		append("world").
		append(10).
		append(true).toString();
		System.out.println(s1);
		System.out.println(s2);
	}

}
