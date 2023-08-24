package LessonsF1To27;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                          {6},
                          {7, 8, 9}};
        System.out.println(matrix[0][4]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][1]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1] + " " + strings[0][2]); // = null, without 13 line

        String[][] strings1 = {{"❤️ ", "I","   ❤️"},
                          {"❤️", "Love"," ❤️"},
                          {"❤️ ", "U", "   ❤️"}};
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length; j++) {
                System.out.print(strings1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
