package ru.lember.leetcode.string;

import java.util.Arrays;

public class ReportGenerator {


    String generate(String content, int width, int height) {

        StringBuilder sb = new StringBuilder();

        // header
        for (int i = 0; i < width + 4; i++) {
            sb.append("-");
        }

        sb.append("\r\n");

        // fill the content
        char[][] matrix = new char[width][height];

        for (char[] aMatrix : matrix) {
            Arrays.fill(aMatrix, '\u0000');
        }


        for (int k = 0; k < content.length(); k++) {
            int i = k / height;
            int j = k % width;

            matrix[i][j] = content.charAt(k);
        }

        for (char[] aMatrix : matrix) {
            sb.append("| ");
            sb.append(aMatrix);
            sb.append(" |");
            sb.append("\r\n");
        }

        // footer
        for (int i = 0; i < width + 4; i++) {
            sb.append("-");
        }

        return sb.toString();
    }

}
