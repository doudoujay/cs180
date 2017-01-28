/**
 * Created by jay on 2017/1/28.
 */
public class TimePeriods {
    /**
     * returns the String of a period of time associated with the given number of days,
     * or “no match” if no exact match exists.
     */
    public String daysToPeriod(int days) {
        String result = "";
        switch (days) {
            case 1:
                result = "day";
                break;
            case 7:
                result = "week";
                break;
            case 31:
                result = "month";
                break;
            case 365:
                result = "year";
                break;
            case 3652:
                result = "decade";
                break;
            default:
                result = "no match";
        }
        return result;
    }

    /**
     * returns the integer number of days associated with a specified period of time,
     * or -1 if the period doesn't exist in the table.
     */

    public int periodToDays(String period) {
        int result;
        switch (period) {
            case "day":
                result = 1;
                break;
            case "week":
                result = 7;
                break;
            case "month":
                result = 31;
                break;
            case "year":
                result = 365;
                break;
            case "decade":
                result = 3652;
                break;
            default:
                result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        TimePeriods t = new TimePeriods();
        System.out.println(t.daysToPeriod(365)); //prints "year"
        System.out.println(t.daysToPeriod(31)); //prints "month"
        System.out.println(t.daysToPeriod(999)); //prints "no match"
        System.out.println(t.periodToDays("day")); //prints "1"
        System.out.println(t.periodToDays("week")); //prints "7"
        System.out.println(t.periodToDays("henway")); //prints "-1"
    }
}
