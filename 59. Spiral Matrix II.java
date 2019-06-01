class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int row = 0;
        int col = 0;
        int length = n;
        int cur = 1;
        boolean isReverse = false;
        
        while (length > 0) {
            
            if (isReverse) {
                for (int j = 0; j < length; j++) {
                    matrix[row][col] = cur;
                    cur++;
                    col--;
                }
                
                //go to next start
                col++;
                row--;
                
                for (int i = 1; i < length; i++) {
                    matrix[row][col] = cur;
                    cur++;
                    row--;
                }
                
                //go to next start
                row++;
                col++;
                
                isReverse = false;
            } else {
                for (int j = 0; j < length; j++) {
                    matrix[row][col] = cur;
                    cur++;
                    col++;
                }
                
                //go to next start
                col--;
                row++;
                
                for (int i = 1; i < length; i++) {
                    matrix[row][col] = cur;
                    cur++;
                    row++;
                }
                
                //go to next start
                row--;
                col--;

                //reset flag
                isReverse = true;
            }
            
            length--;
        }
        
        return matrix;
    }
}
