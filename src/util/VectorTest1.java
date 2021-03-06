package util;

import java.util.*;

public class VectorTest1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		//순회1
		int count = v.size();
		for(int i = 0 ; i < count; ++i){
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		//삭제
		//v.removeElement("마이콜");
		v.removeElementAt(1);
		//순회2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
