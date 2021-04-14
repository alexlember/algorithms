package ru.lember.dpforinterview.maxSubstring;

public class MaxSubstringDP {

    int maxSubstringLengthDP(String s) {

        int length = s.length();
        int maxLength = 0;

        int[][] sum = new int[length][length];

        for (int i = 0; i < length; i++) {

            sum[i][i] = s.charAt(i) - '0';
            // So to get the value of any character digit, you can just remove the '0', ie 48.
            // Ascii characters are actually numbers. And 0 .. 9 digits are numbers starting from decimal 48 (0x30 hexadecimal).
        }

        for (int len = 2; len <= length; len++) { // len - current substring length
            for (int i = 0;  i < length - len  + 1; i++) {
                int j = i + len - 1;
                int k = len / 2; // half substring length
                sum[i][j] = sum[i][j - k] + sum[j - k + 1][j];

                if (len % 2 == 0 && sum[i][j - k] == sum[j - k + 1][j] && len > maxLength) {
                    maxLength = len;
                }
            }
        }

        return maxLength;

    }
}
