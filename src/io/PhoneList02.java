package io;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneList02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
				//exception을 피하는법 file이 있는지 없는지 먼저 검증
				File file = new File("phone.txt");
				if(file.exists()==false){
					System.out.println("File is not found");
					//System.exit(1); //종료 코드 1은 비정상 0은 정상
					return ;
				}
				
				System.out.println("=============파일정보===============");
				System.out.println("경로 : "+file.getAbsolutePath());
				System.out.println("크기 :"+file.length()+" Bytes");
				Date d = new Date(file.lastModified()); //milliseconds 값으로 반환받게 돼서 format을 해주어야함.
				System.out.println("마지막 수정 :"+new SimpleDateFormat("yyy-MM-dd hh:mm:dd").format(d));
				
				System.out.println("=============전화번호===============");
				Scanner scanner = new Scanner(file);
				
				while(scanner.hasNextLine()){
					String name = scanner.next(); //tap or \n 구분해서 out
					String phone1= scanner.next();
					String phone2= scanner.next();
					String phone3= scanner.next();
					
					System.out.println(name+" : "+phone1+"-"+phone2+"-"+phone3);
				}
				
				scanner.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
