package org.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateProg {

	public static void main(String[] args) throws ParseException {
		String date = "2023-20-28";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(format.parse(date));
		c.add(Calendar.DATE, 25);
		date = format.format(c.getTime());
		System.out.println(date);
	}
}
