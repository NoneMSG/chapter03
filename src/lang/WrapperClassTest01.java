package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Character ch = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		// Auto boxing
		// 상수 풀을 거쳐서 자동으로 new Integer(10)이 된다.
		Integer j = 10;
		
		// Auto unboxing
		//int k = 10 + j.intValue();
		int k = 10 + j;
		
	}
	public static void swap(Integer i, Integer j){
		//객체이지만 내부 를 수정할 수 없기 때문에 
		//swap되지 않는다.
	}

}
