package tdd;

public class IntroductionToArrays {
    public static void main(String[] args) {

        int [][]picture = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0},
                { 0, 0, 0,1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},};

        int row = 0, colum = 0;
        for(row = 0; row < picture.length; row++){
            for (colum = 0; colum < picture[row].length; colum++){
            if (picture[row][colum] == 1){
                System.out.print('*');
            } else if (picture[row][colum] == 0) {
                System.out.print(' ');
            }

            } System.out.println();
        }

        }
    }

