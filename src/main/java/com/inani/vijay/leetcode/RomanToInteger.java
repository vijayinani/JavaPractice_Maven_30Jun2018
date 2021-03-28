package com.inani.vijay.leetcode;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

/*    public int romanToInt(String s) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('M', 1000);
        romanToInteger.put('D', 500);
        romanToInteger.put('C', 100);
        romanToInteger.put('L', 50);
        romanToInteger.put('X', 10);
        romanToInteger.put('V', 5);
        romanToInteger.put('I', 1);

        int integerValue = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if (romanToInteger.get(currentChar) < romanToInteger.get(nextChar)) {
                integerValue -= romanToInteger.get(currentChar);
            } else {
                integerValue += romanToInteger.get(currentChar);
            }
        }
        integerValue += romanToInteger.get(s.charAt(s.length() - 1));
        return integerValue;
    }*/

    public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length - 1];
    }
}

