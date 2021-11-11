package com.inani.vijay.leetcode;

public class _1154DayoftheYear {

    public static void main(String[] args) {
        //System.out.println(new _1154DayoftheYear().dayOfYear("2019-01-09"));
        //System.out.println(new _1154DayoftheYear().dayOfYear("2019-02-10"));
        System.out.println(new _1154DayoftheYear().dayOfYear("2003-03-01"));
    }

    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        boolean isLeapYear = checkLeapYear(year);

        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;

        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
            if (isLeapYear && i == 1) {
                days += 1;
            }
        }

        return days + day;

    }

    private boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
