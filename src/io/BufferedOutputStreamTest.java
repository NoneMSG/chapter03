package io;
import java.io.*;
public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			 bos = new BufferedOutputStream(fos,5); //2번 파람은 버퍼사이즈
			
			for(int i ='1'; i<='9' ; ++i){
				bos.write(i); 
				// buffer가 차지 않은 상태에서 flush 한다. close하면 자동으로 flush() 실행
				bos.flush(); 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found "+e);
		}catch(IOException e){
			System.out.println("IO error"+e);
		}finally{
			try{if(bos!=null)
				bos.close();
			}catch(IOException e){
				System.out.println("IO error"+e);
			}
		}
		
	}

}
