package Project3;

public class Task3 {

    public static void main(String[] args) {

        int[][] number = {
                {15, 14, 31, 34, 29},
                {21, 23, 81, 7, 4},
                {30, 4, 13, 11, 18}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (number[i][j] % 2 == 0) {
                    System.out.println(number[i][j]+" ");
                }

            }
        }
    }
}
