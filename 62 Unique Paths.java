/*We only need to store the previous row/column to perform the calculation for the next one. So an 1-d array would suffice. 
You could also choose to iterate through m or n depending on which direction you choose to go (by row or by column). 
Note that the first element of the array will always be 1.*/
public class Solution {
    public int uniquePaths(int m, int n) {
        if (m <= 1|| n <= 1) return 1;
        int w= m>n? m: n;
        int h= m<n? m: n;
        int[] count= new int[h];
        for (int i= 0; i < h; i++)
            count[i]= 1;
        for (int i= 1; i < w; i++) {
            for (int j= 1; j < h; j++) {
                count[j] += count[j-1];
            }
        }
        return count[h-1];
    }
}

/*The assumptions are When (n==0||m==0) the function always returns 1 since the robot can't go left or up.
For all other cells. The result = uniquePaths(m-1,n)+uniquePaths(m,n-1)
Therefore I populated the edges with 1 first and use DP to get the full 2-D array.*/
 public class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] map = new Integer[m][n];
        for(int i = 0; i<m;i++){
            map[i][0] = 1;
        }
        for(int j= 0;j<n;j++){
            map[0][j]=1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                map[i][j] = map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}
