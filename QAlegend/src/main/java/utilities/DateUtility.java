package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	
	public static String getCurrentDate() {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	String formattedDate = sdf.format(date);
	return formattedDate;
	}
	public static String getCurrentDate2() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = sdf.format(date);
		return formattedDate;
		}
}
