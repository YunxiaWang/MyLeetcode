public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int col= obstacleGrid[0].length;
        int[] colPath= new int[col];
        colPath[0]= 1;
        for (int[] row: obstacleGrid) {
            for (int j= 0; j < col; j++) {
                if (row[j] == 1) colPath[j]= 0;
                else if (j > 0) colPath[j] += colPath[j-1];
            }
        }
        return colPath[col-1];
    }
}

/* bottom up, find path from the end point, no extra place */
 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    for (int r = m - 1; r >= 0; r--) {
        for (int c = n - 1; c >= 0; c--) {
            if (obstacleGrid[r][c] == 1) obstacleGrid[r][c] = 0;
            else {
                if (r == m - 1 && c == n - 1) obstacleGrid[r][c] = 1;
                else if (r == m - 1) obstacleGrid[r][c] = obstacleGrid[r][c + 1];
                else if (c == n - 1) obstacleGrid[r][c] = obstacleGrid[r + 1][c];
                else obstacleGrid[r][c] = obstacleGrid[r][c + 1] + obstacleGrid[r + 1][c];
            }
        }
    }
    return obstacleGrid[0][0];
}
