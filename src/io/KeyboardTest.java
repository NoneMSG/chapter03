package io;
import java.io.*;
public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			//기반 스트림은 System.in(표준 입력 = 키보드 입력)
			InputStreamReader isr = new InputStreamReader(System.in,"utf-8");
			br = new BufferedReader(isr);
			
			while( true ){
				System.out.print(">> "); //prompt 
				String line = br.readLine();
				if(line==null){
					break;
				}else if("exit".equals(line)==true){
					break;
				}
				System.out.println(line);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
