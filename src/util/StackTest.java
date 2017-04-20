package util;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("DOOLI");
		stack.push("MICOL");
		stack.push("DOUNUT");
		stack.push("DOOLI");
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack은 비어있을 때 pop()호출 시 예외 발생
		System.out.println(stack.isEmpty() ? "비었음 돌아가" : stack.pop());
		System.out.println(stack.isEmpty());
	}

}
