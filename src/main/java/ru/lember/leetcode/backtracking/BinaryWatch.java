package ru.lember.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 *
 * Each LED represents a zero or one, with the least significant bit on the right.
 *
 *
 * For example, the above binary watch reads "3:25".
 *
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 *
 * Example:
 *
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class BinaryWatch {

//    private static final int HOUR_BOUND = 11;
//    private static final int MINUTE_BOUND = 59;
//    private static final int ALL_BITS_COUNT = 10;
//    private static final int HOUR_BITS_COUNT = 4;
//
//    private List<String> result;
//
//    public List<String> readBinaryWatch2(int num) {
//        result = new ArrayList<>();
//        backtrack(0, num, 0, 0, result);
//        return result;
//    }
//
//
//    private void backtrack(int index, int num, int hour, int minute, List<String> result) {
//
//        if (hour > HOUR_BOUND || minute > MINUTE_BOUND) {
//            return;
//        }
//
//        if (num == 0) {
//            String time = "" + hour + ":" + (minute < 10 ? ("0" + minute) : minute);
//            result.add(time);
//            return;
//        }
//
//        for (int i = index; i < ALL_BITS_COUNT; i++) {
//
//            if (i < HOUR_BITS_COUNT) {
//                hour += (int) (Math.pow(2, i));
//            } else {
//                minute += (int) (Math.pow(2, (i - HOUR_BITS_COUNT)));
//            }
//
//            backtrack(i + 1, num - 1, hour, minute, result);
//
//        }
//
//
//    }

    String convert(String binaryBoth) {
        return convert(binaryBoth.substring(0, 4), convertMinutes(binaryBoth.substring(4, 10)));
    }

    String convert(String hourBinary, String minuteBinary) {
        return convertHours(hourBinary) + ":" + convertMinutes(minuteBinary);
    }

    String convertHours(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return String.valueOf(decimal);
    }

    String convertMinutes(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        boolean noLeadingZero = decimal / 10 >= 1;
        return String.valueOf(noLeadingZero ? decimal : ("0" + decimal));
    }

    private static final int HOUR_BOUND = 11;
    private static final int MINUTE_BOUND = 59;
    private static final int HOUR_BITS_COUNT = 4;

    private static final int[] POW_2 = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};

    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        backtrack(num, 0, 0, 0, ans);
        return ans;
    }

    public void backtrack(int n, int start, int hours, int minutes, List<String> ans) {
        if (hours > HOUR_BOUND || minutes > MINUTE_BOUND) {
            return;
        }

        if (n == 0) {
            ans.add("" + hours + ":" + (minutes < 10 ? ("0" + minutes) : minutes));
            return;
        }

        for (int i = start; i < POW_2.length; i++) {
            int choice = POW_2[i];

            if (i < HOUR_BITS_COUNT) {
                backtrack(n - 1, i + 1, hours + choice, minutes, ans);
            } else {
                backtrack(n - 1, i + 1, hours, minutes + choice, ans);
            }
        }
    }

}
