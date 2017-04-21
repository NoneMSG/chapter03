package lang;

public class PointTest {

	public static void main(String[] args) {

		Point pt = new Point();
		
		System.out.println(pt.getClass().getName());
		System.out.println(pt.hashCode()); //객체의 ID, 객체의 reference값
		//getClass().getName() + "@" + hashCode() 이런 과정으로 toString을 부름
		System.out.println(pt.toString());
		System.out.println(pt);
		
		//String 객체와 비교
		String s = new String("Hello");
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s);
	}

}
