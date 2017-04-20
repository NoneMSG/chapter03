package util;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("둘리", new Integer(100));
		map.put("마이콜", new Integer(150));
		map.put("도너츠", 80);
		map.put("둘리",95);
		
		//auto unboxing
		//int score = map.get("마이콜");
		Integer score = map.get("마이콜");
		System.out.println(score);
		//해싱은 값으로 데이터가 있는지 없는지 비교하기 때문에 객체를 새로 만들어서 key를 찾으려 해도
		//찾을 수 있다. 새로운 객체의 key값이 같기때문이다. 단, key가 같다면
		System.out.println(map.get(new String("둘리")));
		
		//평균
		Set<String> keySet = map.keySet();
		int count = keySet.size();
		
		int sum = 0;
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			//System.out.println(key);
			int s = map.get(key);
			sum+=s;
		}
		System.out.println("평균은 : "+ (sum/count));
	}

}
