package util;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		//정수값을 넣고 싶다면 Integer형으로 제네릭을 사용해야한다.
				List<String> list = new ArrayList<String>();
				
				//삽입
				list.add("둘리");
				list.add("마이쿨");
				list.add("도너츠");
				
				//순회1
				int count = list.size();
				for(int i = 0 ; i < count ; ++i){
					String s = list.get(i);
					System.out.println(s);
				}
				
				//삭제
				list.remove(1);
				
				//순회2
				Iterator<String> it = list.iterator();
				while(it.hasNext()){
					String s = it.next();
					System.out.println(s);
				}

				//순회3
				for(String s : list){
					System.out.println(s);
				}

	}

}
