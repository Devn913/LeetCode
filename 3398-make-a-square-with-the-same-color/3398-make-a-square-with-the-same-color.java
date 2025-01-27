class Solution {
    public boolean canMakeSquare(char[][] grid) {
        byte countB = 0, countW = 0;

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grid[i][j] == 'B') {
                    countB++;
                }else {
                    countW++;
                }
            }
            if (countB > 2 || countW > 2) {
                return true;
            }
        }

        countB = 0; countW = 0;

        for (int i = 0; i <= 1; i++) {
            for (int j = 1; j <= 2; j++) {
                if (grid[i][j] == 'B') {
                    countB++;
                }else {
                    countW++;
                }
            }
            if (countB > 2 || countW > 2) {
                return true;
            }
        }

        countB = 0; countW = 0;

        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grid[i][j] == 'B') {
                    countB++;
                }else {
                    countW++;
                }
            }
            if (countB > 2 || countW > 2) {
                return true;
            }
        }


        countB = 0; countW = 0;

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                if (grid[i][j] == 'B') {
                    countB++;
                }else {
                    countW++;
                }
            }
            if (countB > 2 || countW > 2) {
                return true;
            }
        }

        return false;
    }
}