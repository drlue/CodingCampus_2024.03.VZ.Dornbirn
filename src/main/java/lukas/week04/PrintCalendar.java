package lukas.week04;

import ardijanla.ConsoleColors;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PrintCalendar {

    public static void main(String[] args) {
        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        System.out.println("Today: " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        printCalendar(2567, 3);
        System.out.println();
        Locale.setDefault(Locale.GERMANY);
        System.out.println("Today: " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        printCalendar(2024, 3);

    }

    public static int[][] getCalendarBoard(int year, int month) {
        //prepare board
        Calendar calFirstDayOfMonth = Calendar.getInstance();
        calFirstDayOfMonth.set(year, month - 1, 1);

        int maxDaysOfMonth = calFirstDayOfMonth.getMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfMonth = calFirstDayOfMonth.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = calFirstDayOfMonth.getFirstDayOfWeek();
        //Index starts with 0 -> Mon till 7 -> Sun
        int startIndex = (firstDayOfMonth + 7 - firstDayOfWeek) % 7;
        int daysInFirstRow = (7 - startIndex);
        //rows with full weeks = 7 days
        int boardRows = 1 + (maxDaysOfMonth - daysInFirstRow) / 7;
        //additional row for remaining days
        boardRows = ((maxDaysOfMonth - daysInFirstRow) % 7 == 0) ? boardRows : boardRows + 1;

        //create board
        int[][] board = new int[boardRows][7];

        //Version 1
        int day = 1;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (day <= maxDaysOfMonth && (row == 0 && col >= startIndex || row > 0)) {
                    board[row][col] = day;
                    day++;
                }
            }
        }
        return board;
    }

    public static void printCalendar(int year, int month) {
        //prepare input
        int[][] board = getCalendarBoard(year, month);
        String[] columnColors = getDayColors();
        String[] shortDayNamesArr = getShortDayNames();
        int dayNameLength = shortDayNamesArr[0].length();

        Calendar firstDay = Calendar.getInstance();
        firstDay.set(year, month - 1, 1);
        Locale locale = (Locale.getDefault().getLanguage().equals("th")) ? Locale.ENGLISH : Locale.getDefault();
        String monthName = firstDay.getDisplayName(Calendar.MONTH, Calendar.LONG, locale);
        //alternativ
        //String monthName2 = new SimpleDateFormat("MMMM", locale).format(firstDay.getTime());

        //print header
        System.out.printf("%s %s\n", year, monthName);
        for (int col = 0; col < shortDayNamesArr.length; col++) {
            if (col == 0) {
                System.out.print("|");
            }
            System.out.printf(" %s%" + dayNameLength + "s%s |", columnColors[col], shortDayNamesArr[col], ConsoleColors.RESET);
        }
        System.out.println();

        //print calendar
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (col == 0) {
                    System.out.print("|");
                }
                System.out.printf(" %s%" + dayNameLength + "s%s%s|", columnColors[col], ((board[row][col] > 0) ? board[row][col] : ""), (isToday(year, month, board[row][col])) ? "*" : " ", ConsoleColors.RESET);
            }
            System.out.println();
        }
    }

    public static String[] getShortDayNames() {
        //because thai names not shown in console
        Locale locale = (Locale.getDefault().getLanguage().equals("th")) ? Locale.ENGLISH : Locale.getDefault();

        DateFormatSymbols dFS = new DateFormatSymbols(locale);
        String[] dFSNames = dFS.getShortWeekdays();
        String[] cleanWeekdayNameArray = new String[7];

        //get int of first day in the week (locale!)
        Calendar tmpCal = Calendar.getInstance();
        int first = tmpCal.getFirstDayOfWeek();

        //reorder weekdays, first weekday (locale!) is first element of array
        for (int i = 1; i < dFSNames.length; i++) {
            cleanWeekdayNameArray[(i + 7 - first) % 7] = dFSNames[i];
        }
        return cleanWeekdayNameArray;
    }

    public static String[] getDayColors() {
        //define colors
        String colorWorkDay = ConsoleColors.RESET;
        String colorSaturday = ConsoleColors.WHITE_BOLD;
        String colorSunday = ConsoleColors.RED_BOLD;

        //prepare data
        String[] dayColors = new String[7];
        Calendar tmpCal = Calendar.getInstance();
        int first = tmpCal.getFirstDayOfWeek();

        int colIndex = 0;
        for (int i = 1; i < 8; i++) {
            colIndex = (i + 7 - first) % 7; //reorder weekdays based on first (locale!)
            switch (i) {
                case 1: //SUNDAY
                    dayColors[colIndex] = colorSunday;
                    break;
                case 7: //SATURDAY
                    dayColors[colIndex] = colorSaturday;
                    break;
                default:
                    dayColors[colIndex] = colorWorkDay;
            }
        }
        return dayColors;
    }

    public static boolean isToday(int year, int month, int day) {
        //date to compare
        Calendar myDate = Calendar.getInstance();
        myDate.set(year, month - 1, day);
        //today
        Calendar today = Calendar.getInstance();
        return myDate.equals(today);
    }
}
