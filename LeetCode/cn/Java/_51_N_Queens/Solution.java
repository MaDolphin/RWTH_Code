// @algorithm @lc id=51 lang=java 
// @title n-queens

package _51_N_Queens;
import java.util.*;
// @test(4)=[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
// @test(1)=[["Q"]]
public class Solution {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] cline : chessboard) {
            Arrays.fill(cline, '.');
        }
        backtracking(n, 0, chessboard);
        return result;
        
    }

    private void backtracking(int n, int row, char[][] chessboard) {
        if (row == n) {
            result.add(array2List(chessboard));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(n, row, col, chessboard)) {
                chessboard[row][col] = 'Q';
                backtracking(n, row + 1, chessboard);
                chessboard[row][col] = '.';
            }
        }
    }

    private List array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for (char[] cline : chessboard) {
            list.add(String.copyValueOf(cline));
        }
        return list;
    }

    private boolean isValid(int n, int row, int col, char[][] chessboard) {
        // 检查列
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }

        // 检查对角线 右上-> 左下
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        // 检查对角线 左上-> 右下
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}