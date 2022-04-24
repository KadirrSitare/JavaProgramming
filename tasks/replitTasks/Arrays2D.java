package replitTasks;

public class Arrays2D {

    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12, 13}};

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
