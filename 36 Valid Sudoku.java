public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map= new HashMap<>();
        for (int i= 0; i < 9; i++) {
            map= new HashMap<Character, Integer>();
            for (int j= 0; j < 9; j++) {
                if (board[i][j] != '.') { //先判断是否为空
                    if (map.containsKey(board[i][j])) return false;
                    map.put(board[i][j], 1);
                }
            }
            map= new HashMap<Character, Integer>();
            for (int j= 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (map.containsKey(board[j][i])) return false;
                    map.put(board[j][i], 1);
                }
            }
        }
        for (int k= 0; k < 9; k+=3) { //注意循环的层数和顺序
            for (int h= 0; h < 9; h+=3) {
                map= new HashMap<Character, Integer>();
                for (int i= k; i < k+3; i++) {
                    for (int j= h; j < h+3; j++) {
                        if (board[i][j] != '.') {
                            if (map.containsKey(board[i][j])) return false;
                            map.put(board[i][j], 1);
                        }
                    }
                }
            }
        }
        return true;
    }
}
