import java.util.*;

class Java_date_and_time {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        Calendar calendar = new GregorianCalendar(year, month - 1 , day);
        return calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG,Locale.US).toUpperCase();
    }

}