package oop.labor10.lab10_2;

public class DateUtil {
    public static boolean IsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day >= 1 && day <= 31) {
            return true;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day >= 1 && day <= 30) {
            return true;
        }
        if (month == 2) {
            if ((IsLeapYear(year) && day >= 1 && day <= 29) || (!IsLeapYear(year) && day >= 1 && day <= 28)) {
                return true;
            }
        }
        return false;
    }
}