package lang;

public class EqualsTest {

	public static void main(String[] args) {
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);
		Point pt3 = pt2;
		/*
		 * Point 객체 비교
		 * equals, hashCode 메소드가 오버라이드 안된 경우
		 */
				
		// (==) 연산자에서 두 개의 항이 객체 참조 변수인 경우
		// 두 객체의 동일 여부를 확인(동일성)
		System.out.println(pt1==pt2);
		System.out.println(pt2==pt3);
		
		// 동질성 비교를 할 때에는 equals() 메소드 사용
		// equals의 기본형에서는 (==) 연산자와 동일하다. (오버라이딩이 필요)
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));

		
		/*
		 * String 객체 비교
		 * equals, hashCode 메소드가 오버라이드 된 경우
		 */
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3= s2;
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//hashCode 출력
		//String 클래스는 내용기반으로 hashCode를 생성하게
		//hashCode()메소드가 오버라이드 되어있다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//참조값(객체ID)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		/*
		 * literal을 사용하는 경우
		 * JVM 안의 literal(상수) pool에서 객체 생성 관리를 하기 때문에
		 * 문자열 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다. (같은 문자열객체를 참조)
		 */
		String str1 ="hello";
		String str2 ="hello";
		String str3 = str2;
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
	}

}
