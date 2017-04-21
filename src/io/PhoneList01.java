package io;
import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {
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
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
				
				br = new BufferedReader(isr);
				
				String line = null;
				while((line=br.readLine())!=null){
					StringTokenizer st = new StringTokenizer(line,"\t ");
					int index = 0 ;
					while( st.hasMoreTokens() ){
						String s = st.nextToken();
						if(index==0){
							System.out.print(s+":");
						}else if(index==1){
							System.out.print(s+"-");
						}else if(index==2){
							System.out.print(s+"-");
						}else if(index==3){
							System.out.print(s);
						}
						index++;
					}
					System.out.println();
				}
				
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null){
					br.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
