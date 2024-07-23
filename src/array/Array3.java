package array;

public class Array3 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//        };
        int[][] arr2 = new int[2][3];
        int num = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = num++;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
