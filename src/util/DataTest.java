package util;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataTest {

	public static void main(String[] args) {
		Date now = new Date();
		//System.out.println(now);
		printDate(now);
		printDate2(now);
		
		//특정 날짜 세팅(2000/4/21)
		Date d2 = new Date(100,3,21);
		printDate(d2);
		
		//특정 시간 세팅(2000/4/21 13:25:30)
		Date d3 = new Date(100,3,21,13,25,30);
		printDate(d3);
		
		//1970년 1월 1일 00:00:00.000 milliseconds 값 세팅
		long milliseconds = 24L * 60 * 60 * 1000 * 365 * 30;
		Date d4 = new Date(milliseconds);
		printDate(d4);
	}
	public static void printDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일-hh시-mm분-ss초");
		System.out.println(sdf.format(date));
	}
	public static void printDate2(Date d){
		//년도 + 1900
		int year = d.getYear();
		
		//월
		int month = d.getMonth();
		
		//일
		int date = d.getDate();
		
		//시
		int hours = d.getHours();
		
		//분
		int minutes = d.getMinutes();
		
		//초
		int seconds = d.getSeconds();
		System.out.println((year+1900)+"년"+(month+1)+"월"+date
						+"일"+hours+"시"+minutes+"분"+seconds+"초");
	}
}
