package classicSelenium;

import java.time.LocalDateTime;

public class DateTime {
	public static void main(String[] args) {
		LocalDateTime systemdate=LocalDateTime.now();
		String date=systemdate.toString().replaceAll(":", "-");
		System.out.println(date);
	}
	

}
 