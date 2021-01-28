package ru.lember.leetcode.hasht;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * A partially filled sudoku which is valid.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Example 1:
 *
 * Input:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 * Example 2:
 *
 * Input:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being
 *     modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.
 */
public class ValidSudoku {

    private static final int CELLS_IN_UNIT = 9;
    private static final int CELLS_IN_BOX = 3;
    private static final char DOT_CHAR = '.';

    private static final List<Map<Character, Integer>> ROW_FREQUENCIES = new ArrayList<>();
    private static final List<Map<Character, Integer>> COLUMN_FREQUENCIES = new ArrayList<>();
    private static final List<Map<Character, Integer>> BOX_3_X_3_FREQUENCIES = new ArrayList<>();

    public boolean isValidSudoku(char[][] board) {

        init();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                char current = board[i][j];

                try {
                    addToMapOrFail(current, ROW_FREQUENCIES.get(i));
                    addToMapOrFail(current, COLUMN_FREQUENCIES.get(j));

                    int jBox = j / CELLS_IN_BOX;
                    int iBox = i / CELLS_IN_BOX;
                    int currentBox = iBox * CELLS_IN_BOX + jBox;

                    addToMapOrFail(current, BOX_3_X_3_FREQUENCIES.get(currentBox));
                } catch (RuntimeException e) {
                    return false;
                }
            }
        }


        return true;
    }

    private void init() {
        ROW_FREQUENCIES.clear();
        COLUMN_FREQUENCIES.clear();
        BOX_3_X_3_FREQUENCIES.clear();


        BigDecimal db = new BigDecimal(58.8, new MathContext(4, RoundingMode.HALF_UP));
        for (int i = 0; i < CELLS_IN_UNIT; i++) {

            Map<Character, Integer> currentRowMap = new HashMap<>();
            ROW_FREQUENCIES.add(currentRowMap);

            Map<Character, Integer> currentColMap = new HashMap<>();
            COLUMN_FREQUENCIES.add(currentColMap);

            Map<Character, Integer> currentBoxMap = new HashMap<>();
            BOX_3_X_3_FREQUENCIES.add(currentBoxMap);
        }
    }

    private void addToMapOrFail(char current, Map<Character, Integer> currentFrequenciesMap) {
        if (current != DOT_CHAR) {
            Integer currFreq = currentFrequenciesMap.get(current);
            if (currFreq != null && currFreq > 0) {
                throw new RuntimeException("non valid sudoku");
            } else {
                currentFrequenciesMap.put(current, 1);
            }
        }
    }




}
