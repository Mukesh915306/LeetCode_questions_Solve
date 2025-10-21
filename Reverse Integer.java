//Binary search method
class Solution {
    public int reverse(int x) {
        int r = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            r = r * 10 + digit;
        }

        return r;
    }
}

//Brutforce Method

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
