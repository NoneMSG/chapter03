package io;
import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr =null ;
		
		try {
			//주스트림
			isr = new InputStreamReader(new FileInputStream("ms949.txt"),"MS949");
			int data = -1;
			while( (data = isr.read()) != -1 ){
				System.out.print((char)data);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}
