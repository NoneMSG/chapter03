package io;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr =null;
		FileInputStream fis=null;
		try{
			//file을 읽기 위해서는 char단위로 받아와야 한다. 
			//FileReader는 읽어오는 기본 포맷이 utf-8로 디폴트 되어있다.
			 fr = new FileReader("hello.txt");
			 fis = new FileInputStream("hello.txt");
			int count = 0;
			int data = -1;
			
			while( (data=fr.read()) != -1 ){
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은 회수 :"+count);
			System.out.println("---------------------------");
			
			count = 0;
			while( (data=fis.read()) != -1 ){
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은 회수 :"+count);
		}catch (FileNotFoundException e){
			System.out.println("File not found : "+e);
		}catch (IOException e){
			System.out.println("IO Error : "+e);
		}finally{
			try{
				if(fr!=null){
					fr.close();
				}
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				System.out.println("IO error :"+e);
			}
		}
	}
}
