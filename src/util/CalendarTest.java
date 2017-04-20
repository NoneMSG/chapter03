package util;
import java.util.*;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//특정날짜 세팅
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DATE, 3);
		//cal.set(2007,10,12)
		
		//기념일
		cal.add(Calendar.DATE, 1000);
		
		printDate(cal);
	}
	public static void printDate(Calendar cal){
		
		String[] days = { "일", "월", "화", "수", "목", " 금", "토"};
		int year = cal.get(Calendar.YEAR);
		//0~11
		int month = cal.get(Calendar.MONDAY);
		int date = cal.get(Calendar.DATE);
		//1(일)~7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int am = cal.get(Calendar.AM_PM);
		int hours = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		System.out.println(
				year+"년 "
				+(month+1)+"월 "
				+date+"일 "
				+days[day-1]+"요일 "
				+hours+"시 "
				+minutes+"분 "
				+seconds+"초 "
				+(am==0?"오전":"오후")
				);
	}

}
